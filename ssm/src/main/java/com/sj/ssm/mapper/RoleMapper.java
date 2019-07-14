package com.sj.ssm.mapper;

import com.sj.ssm.domain.Role;

import java.util.List;

public interface RoleMapper {
    /**
     * 查询所以角色信息
     * @return
     */
    List<Role> selectAllRole();
}
