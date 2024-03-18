package com.greta.emp.service;

import com.greta.emp.dto.EmployeDto;

import java.util.List;

public interface EmployeService {

    EmployeDto createEmploye (EmployeDto employeDto);

    EmployeDto getEmployeById(Long employeeId);

    List<EmployeDto> getAllEmployes();

    EmployeDto updateEmploye(Long employeeId, EmployeDto updatedEmployee);

    void deleteEmploye(Long employeeId);

}
