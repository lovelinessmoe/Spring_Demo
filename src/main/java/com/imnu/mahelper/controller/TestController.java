package com.imnu.mahelper.controller;

import com.imnu.mahelper.eneity.Test;
import com.imnu.mahelper.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String test(Model model){
        List<Test> tests = testService.findAll();
        model.addAttribute("lists",tests);
        return "table";
    }

    @RequestMapping("/test/delete")
    public String delete(Integer id){
        int ret = testService.delete(id);
        if (ret > 0){
            return "redirect:/test";
        }else {
            return "";
        }
    }

    @RequestMapping("/test/update")
    public String update(Integer id,Model model){
        model.addAttribute("id",id);
        return "update";
    }

    @RequestMapping("/test/updateData")
    public String updateData(Test test){
        int ret = testService.update(test);
        if (ret > 0){
            return "redirect:/test";
        }else {
            return "update";
        }
    }

    @RequestMapping("/test/insert")
    public String insert(){
        return "insert";
    }

    @RequestMapping("/test/insertData")
    public String insertData(Test test){
        testService.insert(test);
        return "redirect:/test";
    }
}
