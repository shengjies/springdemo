package com.sj.ssm.controller;

import com.sj.ssm.domain.User;
import com.sj.ssm.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user")
    public String user(ModelMap modelMap)
    {
        modelMap.put("users",userService.selectUserAll());
        return "user";
    }

    /**
     * 查询所以用户信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/user/all")
    public List<User> selectUserAll(){
       return userService.selectUserAll();
    }

    /**
     * 添加用户
     * @return
     */
    @ResponseBody
    @RequestMapping("/user/save")
    @RequiresPermissions("user:save")
    public String save(){
        System.out.println("save user");
        return "用户添加成功";
    }

    /**
     * 删除用户
     * @return
     */
    @ResponseBody
    @RequestMapping("/user/del")
    @RequiresPermissions("user:del")
    public String del(){
        System.out.println("del user");
        return "用户删除成功";
    }
}
