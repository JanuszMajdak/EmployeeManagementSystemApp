package pl.januszmajdak.employeesmansys.services;

import pl.januszmajdak.employeesmansys.dto.EmployeeDto;
import pl.januszmajdak.employeesmansys.exceptions.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> findEmployee();

    EmployeeDto findEmployeeById(long employeeId) throws EmployeeNotFoundException;

    void saveEmployee(EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);



}
