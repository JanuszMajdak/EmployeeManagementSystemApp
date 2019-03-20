package pl.januszmajdak.employeesmansys.converters;

import pl.januszmajdak.employeesmansys.dto.SalaryDto;
import pl.januszmajdak.employeesmansys.entities.Salary;

import java.util.function.Function;

public class SalaryDtoConverter implements Function<Salary, SalaryDto> {
    @Override
    public SalaryDto apply(Salary salary) {
        SalaryDto salaryDto = new SalaryDto(salary.getFirstName(), salary.getLastName(), salary.geteMail(), salary.getMonth(), salary.getYear(), salary.getAmount());
        return salaryDto;
    }
}
