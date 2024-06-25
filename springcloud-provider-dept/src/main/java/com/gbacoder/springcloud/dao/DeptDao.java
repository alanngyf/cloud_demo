package com.gbacoder.springcloud.dao;

import com.gbacoder.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author alanulog
 * @create 6/23/2024 8:53 PM
 */

@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAllDept();
}
