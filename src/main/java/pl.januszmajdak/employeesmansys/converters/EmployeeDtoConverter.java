package pl.januszmajdak.employeesmansys.converters;

import pl.januszmajdak.employeesmansys.dto.EmployeeDto;
import pl.januszmajdak.employeesmansys.entities.Employee;

import java.util.function.Function;

public class EmployeeDtoConverter implements Function<Employee, EmployeeDto> {


    @Override
    public EmployeeDto apply(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getFatherName(), employee.getMotherName(), employee.getDateOfBirth(), employee.getLogin(), employee.getPassword(), employee.getConfirmedPassword(), employee.getMobilePhoneNum(), employee.getGender(), employee.getPosition(), employee.getDepartment(), employee.geteMail(), employee.getDateOfJoining(), employee.getEducation(), employee.getSoftwareSkills(), employee.getPersonalSkills(), employee.getCurrentAddress(), employee.getPermanentAddress());
        return employeeDto;
    }
}
