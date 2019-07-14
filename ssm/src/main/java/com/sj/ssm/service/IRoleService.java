package com.sj.ssm.service;

import com.sj.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    /**
     * 查询所以角色信息
     * @return
     */
    List<Role> selectRoleAll();
}
