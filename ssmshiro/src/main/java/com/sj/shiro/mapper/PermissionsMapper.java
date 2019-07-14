package com.sj.shiro.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionsMapper {
    /**
     * 根据用户id查询对应的用户的权限
     * @param userId 用户id
     * @return
     */
    List<String> selectPermissionsByUserId(@Param("userId") int userId);
}
