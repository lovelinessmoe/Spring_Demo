package com.imnu.mahelper.serviceImpl;

import com.imnu.mahelper.eneity.Test;
import com.imnu.mahelper.mapper.TestMapper;
import com.imnu.mahelper.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;
    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }

    @Override
    public int delete(Integer id) {
        return testMapper.delete(id);
    }

    @Override
    public int update(Test test) {
        return testMapper.update(test);
    }

    @Override
    public void insert(Test test) {
        testMapper.insert(test);
    }
}
