package com.greta.emp.mapper;

import com.greta.emp.dto.EmployeDto;
import com.greta.emp.entity.Employe;

public class EmployeMapper {

    public static EmployeDto mapToEmployeDto(Employe employe) {
       return new EmployeDto(
                employe.getId(),
               employe.getNom(),
               employe.getPrenom(),
               employe.getEmail()

       );

    }

    public static Employe mapToEmploye(EmployeDto employeDto) {
        return new Employe(
                employeDto.getId(),
                employeDto.getNom(),
                employeDto.getPrenom(),
                employeDto.getEmail()

        );

    }


}

