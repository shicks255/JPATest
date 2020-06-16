package com.steven.hicks.Repositories;

import com.steven.hicks.Models.ManyToOne.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
