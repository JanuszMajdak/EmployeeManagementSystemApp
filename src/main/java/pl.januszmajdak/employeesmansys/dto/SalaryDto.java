package pl.januszmajdak.employeesmansys.dto;

import javax.persistence.Column;

public class SalaryDto {

    private String firstName;
    private String lastName;
    private String eMail;
    private Integer month;
    private Integer year;
    private Integer amount;

    public SalaryDto() {

    }

    public SalaryDto(String firstName, String lastName, String eMail, Integer month, Integer year, Integer amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SalaryDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}
