package com.sj.ssm.service;

import com.sj.ssm.domain.Department;

import java.util.List;

public interface IDepartmentService {
    /**
     * 查询所以部门信息
     * @return
     */
    List<Department> selectDepartmentAll();
}
