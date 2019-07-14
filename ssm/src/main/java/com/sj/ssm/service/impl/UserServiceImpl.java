package com.sj.ssm.service.impl;

import com.sj.ssm.domain.User;
import com.sj.ssm.mapper.UserMapper;
import com.sj.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserAll() {
        return userMapper.selectAllUser();
    }

    /**
     * 根据用户名称查询信息
     * @param username 用户名称
     * @return
     */
    @Override
    public User selectUserByUserName(String username) {
        return userMapper.selectUserByUserName(username);
    }


}
