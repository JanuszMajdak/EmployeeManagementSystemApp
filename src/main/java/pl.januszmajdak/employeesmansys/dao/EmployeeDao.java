package pl.januszmajdak.employeesmansys.dao;

import pl.januszmajdak.employeesmansys.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    List<Employee> findAll();

 // Optional<List<Employee>> findAll();


    Optional<Employee> findById(Long id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);

}
