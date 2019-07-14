package com.sj.ssm.controller;

import com.sj.ssm.domain.Role;
import com.sj.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/role")
    public String role(ModelMap modelMap){
        modelMap.put("roles",roleService.selectRoleAll());
        return "role";
    }

    /**
     * 查询所以角色信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/role/all")
    public List<Role> selectRoleAll(){
        return roleService.selectRoleAll();
    }
}
