package pl.januszmajdak.employeesmansys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="salaries")
public class Salary {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String eMail;

    @Column(name="month")
    private Integer month;

    @Column(name="year")
    private Integer year;

    @Column(name="amount")
    private Integer amount;

public Salary(){

}

    public Salary(String firstName, String lastName, String eMail, Integer month, Integer year, Integer amount) {
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
        return "Salary{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}
