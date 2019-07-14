package com.sj.shiro.controller;

import com.sj.shiro.domain.User;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user")
    @RequiresPermissions("user:list")
    public String user(){
        return "user";
    }

    /**
     * 新增用户
     * @return
     */
    @RequestMapping("/user/save")
    @RequiresPermissions("user:save")
    public String save(){
        System.out.println("新增用户成功");
        return "user";
    }

    /**
     * 删除用户
     * @return
     */
    @RequestMapping("/user/del")
    @RequiresPermissions("user:del")
    public String del(){
        System.out.println("删除用户成功");
        return "user";
    }

    /**
     * 修改用户成功
     * @return
     */
    @RequestMapping("/user/edit")
    @RequiresPermissions("user:edit")
    public String edit(){
        System.out.println("修改用户成功");
        return "user";
    }

    @ResponseBody
    @RequestMapping("/user/test")
    public String test(@RequestBody User user){
        System.out.println(user);
        return "abc";
    }
}
