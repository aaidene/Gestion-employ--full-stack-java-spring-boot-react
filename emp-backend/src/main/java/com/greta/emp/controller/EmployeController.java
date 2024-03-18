package com.greta.emp.controller;

import com.greta.emp.dto.EmployeDto;
import com.greta.emp.service.EmployeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping ("/api/employes")
public class EmployeController {

    private EmployeService employeService;


    // ajouter un employer

    @PostMapping
    public ResponseEntity<EmployeDto> createEmployee(@RequestBody EmployeDto employeeDto){
        EmployeDto savedEmployee = employeService.createEmploye(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmployeDto>> getAllEmployees(){
        List<EmployeDto> employees = employeService.getAllEmployes();
        return ResponseEntity.ok(employees);
    }


}
