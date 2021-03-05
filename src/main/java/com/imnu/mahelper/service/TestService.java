package com.imnu.mahelper.service;

import com.imnu.mahelper.eneity.Test;

import java.util.List;

public interface TestService {
    List<Test> findAll();

    int delete(Integer id);

    int update(Test test);

    void insert(Test test);
}
