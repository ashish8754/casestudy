package com.webapp.casestudy.service;

import com.webapp.casestudy.model.Department;

import java.util.List;
import java.util.Optional;

public interface departmentService {

   public Department saveDepartment(Department department);

   public void deleteDepartmentbyID(Long departmentId);


   public List<Department> listAllDept();
}
