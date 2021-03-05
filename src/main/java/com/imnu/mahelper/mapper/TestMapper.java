package com.imnu.mahelper.mapper;

import com.imnu.mahelper.eneity.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from user")
    List<Test> findAll();

    @Delete("delete from user where id = #{id}")
    int delete(Integer id);

    @Update("update user set username=#{username},password = #{password} where id = #{id}")
    int update(Test test);

    @Insert("insert into user (username,password)values(#{username},#{password})")
    void insert(Test test);
}
