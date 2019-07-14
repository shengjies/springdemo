package com.sj.ssm.service;

import com.sj.ssm.domain.User;

import java.util.List;

public interface IUserService {
    /**
     * 查询所以用户
     * @return
     */
    List<User> selectUserAll();

    /**
     * 根据用户名称查询信息
     * @param username 用户名称
     * @return
     */
    User selectUserByUserName(String username);
}
