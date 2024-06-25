package com.gbacoder.springcloud.service;

import com.gbacoder.springcloud.dao.DeptDao;
import com.gbacoder.springcloud.pojo.Dept;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alanulog
 * @create 6/23/2024 9:04 PM
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAllDept() {
        return deptDao.queryAllDept();
    }
}
