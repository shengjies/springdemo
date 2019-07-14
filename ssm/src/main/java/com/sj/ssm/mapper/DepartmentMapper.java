package com.sj.ssm.mapper;

import com.sj.ssm.domain.Department;

import java.util.List;

public interface DepartmentMapper {
    /**
     * 查询所以部门信息
     * @return
     */
    List<Department> selectDepartmentAll();
}
