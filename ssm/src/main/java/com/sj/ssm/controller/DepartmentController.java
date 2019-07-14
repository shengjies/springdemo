package com.sj.ssm.controller;

import com.sj.ssm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/department")
    public String department(ModelMap modelMap){
        modelMap.put("ments",departmentService.selectDepartmentAll());
        return "department";
    }
}
