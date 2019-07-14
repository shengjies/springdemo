package com.sj.shiro.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    /**
     * 查询所以角色
     * @return
     */
    List<String> selectAllRole();

    /**
     * 根据用户id查询对应角色
     * @param userId 用户id
     * @return
     */
    List<String> selectRoleByUserId(@Param("userId")int userId);
}
