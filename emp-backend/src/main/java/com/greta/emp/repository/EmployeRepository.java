package com.greta.emp.repository;

import com.greta.emp.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository <Employe ,Long> {

}
