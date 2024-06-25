package com.gbacoder.springcloud.service;

import com.gbacoder.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author alanulog
 * @create 6/23/2024 9:03 PM
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAllDept();
}
