package com.sj.ssm.mapper;

import com.sj.ssm.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所以用户信息
     * @return
     */
    List<User> selectAllUser();

    /**
     * 根据用户名称查询用户信息
     * @param username 用户名称
     * @return
     */
    User selectUserByUserName(@Param("username")String username);
}
