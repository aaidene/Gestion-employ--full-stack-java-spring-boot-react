package com.greta.emp.service.impl;

import com.greta.emp.dto.EmployeDto;
import com.greta.emp.entity.Employe;
import com.greta.emp.mapper.EmployeMapper;
import com.greta.emp.repository.EmployeRepository;
import com.greta.emp.service.EmployeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements EmployeService {
    private EmployeRepository employeRepository;
    @Override
    public EmployeDto createEmploye(EmployeDto employeDto) {

        Employe employe = EmployeMapper.mapToEmploye(employeDto);
         Employe saveEmploye =  employeRepository.save(employe);
        return EmployeMapper.mapToEmployeDto(saveEmploye);
    }

    @Override
    public EmployeDto getEmployeById(Long employeeId) {
        return null;
    }

    @Override
    public List<EmployeDto> getAllEmployes() {
        List<Employe> employes = employeRepository.findAll();
        return employes.stream().map((employe) -> EmployeMapper.mapToEmployeDto(employe))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeDto updateEmploye(Long employeeId, EmployeDto updatedEmployee) {
        return null;
    }

    @Override
    public void deleteEmploye(Long employeeId) {

    }
}
