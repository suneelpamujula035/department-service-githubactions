package com.department.controller;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @QueryMapping
    public List<Department> getAllDepartments()
    {
        return repository.findAll();
    }
}
