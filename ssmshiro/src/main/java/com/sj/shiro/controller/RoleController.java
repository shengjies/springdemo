package com.sj.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {

    @RequestMapping("/role")
    @RequiresPermissions("role:list")
    public String role(){
        return "role";
    }

    /**
     * 新增角色成功
     * @return
     */
    @RequestMapping("/role/save")
    @RequiresPermissions("role:save")
    public String save(){
        System.out.println("新增角色成功");
        return "role";
    }

    /**
     * 修改用户成功
     * @return
     */
    @RequestMapping("/role/edit")
    @RequiresPermissions("role:edit")
    public String edit(){
        System.out.println("修改角色成功");
        return "role";
    }

    /**
     * 删除角色
     * @return
     */
    @RequestMapping("/role/del")
    @RequiresPermissions("role:del")
    public String del(){
        System.out.println("删除角色成功");
        return "role";
    }
}
