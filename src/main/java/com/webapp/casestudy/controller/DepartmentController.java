package com.webapp.casestudy.controller;

import com.webapp.casestudy.model.Department;
import com.webapp.casestudy.service.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @GetMapping("/")
    public String hello()
    {
        return "Welcome to my WebApp";
    }


    @Autowired
    private departmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> listAllDepartments()
    {
        return departmentService.listAllDept();
    }

    @DeleteMapping("/departments/{id}")
    public String removeDepartment(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentbyID(departmentId);
        return "Department has been deleted";
    }


}
