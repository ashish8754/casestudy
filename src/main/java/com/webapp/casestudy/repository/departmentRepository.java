package com.webapp.casestudy.repository;

import com.webapp.casestudy.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface departmentRepository extends JpaRepository<Department, Long> {

}
