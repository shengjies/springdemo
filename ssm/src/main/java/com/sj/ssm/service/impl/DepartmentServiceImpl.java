package com.sj.ssm.service.impl;

import com.sj.ssm.domain.Department;
import com.sj.ssm.mapper.DepartmentMapper;
import com.sj.ssm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门信息操作
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查询所以部门信息
     * @return
     */
    @Override
    public List<Department> selectDepartmentAll() {
        return departmentMapper.selectDepartmentAll();
    }
}
