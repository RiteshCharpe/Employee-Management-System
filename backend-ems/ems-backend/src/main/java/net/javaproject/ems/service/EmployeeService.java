package net.javaproject.ems.service;

import net.javaproject.ems.dto.EmployeeDto;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto>getAllEmployees();

    EmployeeDto updateEmployee(Long id, Map<String, Object> updates);

    void deleteEmployee(Long employeeId);

    

}
