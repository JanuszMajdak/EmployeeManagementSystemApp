package pl.januszmajdak.employeesmansys.services;


import pl.januszmajdak.employeesmansys.converters.EmployeeDtoConverter;
import pl.januszmajdak.employeesmansys.dao.EmployeeDao;
import pl.januszmajdak.employeesmansys.dao.EmployeeDaoImpl;
import pl.januszmajdak.employeesmansys.dto.EmployeeDto;
import pl.januszmajdak.employeesmansys.entities.Employee;
import pl.januszmajdak.employeesmansys.exceptions.EmployeeNotFoundException;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    private EmployeeDtoConverter employeeDtoConverter = new EmployeeDtoConverter();


    @Override
    public List<EmployeeDto> findEmployee() {


        List<Employee> employees = employeeDao.findAll();

        return employees.stream().map(employeeDtoConverter).collect(Collectors.toList());
    }


/*    @Override
    public List<EmployeeDto> findEmployee() {

        Optional<List<Employee>> employeeListOptional = employeeDao.findAll();

        if (employeeListOptional.isPresent()) {
            List<Employee> employee = employeeListOptional.get();
            List<EmployeeDto> employeeDtos = employeeDtoConverter.apply(employee);
            return employeeDtos;
        } else {
            try {
                throw new EmployeeNotFoundException("Problem with List of Employees");

            } catch (EmployeeNotFoundException e) {
                e.printStackTrace();
            }
        }
return null;
    }*/

    @Override
    public EmployeeDto findEmployeeById(long employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employeeOptional = employeeDao.findById(employeeId);

        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            EmployeeDto employeeDto = employeeDtoConverter.apply(employee);
            return employeeDto;
        } else {
            try {
                throw new EmployeeNotFoundException("Employee with id= " + employeeId + " was not found");
            } catch (EmployeeNotFoundException e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    @Override
    public void saveEmployee(final EmployeeDto employeeDto) {

        Function<EmployeeDto, Employee> employeeConverter = t -> new Employee(t.getId(), t.getFirstName(), t.getLastName(), t.getFatherName(), t.getMotherName(), t.getDateOfBirth(), t.getLogin(), t.getPassword(), t.getConfirmedPassword(), t.getMobilePhoneNumber(), t.getGender(), t.getPosition(), t.getDepartment(), t.geteMail(), t.getDateOfJoining(), t.getEducation(), t.getSoftwareSkills(), t.getPersonalSkills(), t.getCurrentAddress(), t.getPermanentAddress());

        Employee employee = employeeConverter.apply(employeeDto);
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeDao.deleteEmployee(employeeId);
    }
}
