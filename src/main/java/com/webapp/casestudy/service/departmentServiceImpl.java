package com.webapp.casestudy.service;

import com.webapp.casestudy.model.Department;
import com.webapp.casestudy.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class departmentServiceImpl implements departmentService{

    @Autowired
    private departmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    @Override
    public void deleteDepartmentbyID(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public List<Department> listAllDept() {

        return departmentRepository.findAll();
    }
}


