package com.sj.ssm.service.impl;

import com.sj.ssm.domain.Role;
import com.sj.ssm.mapper.RoleMapper;
import com.sj.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色操作
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询所以角色信息
     * @return
     */
    @Override
    public List<Role> selectRoleAll() {
        return roleMapper.selectAllRole();
    }
}
