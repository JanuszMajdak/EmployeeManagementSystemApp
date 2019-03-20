package pl.januszmajdak.employeesmansys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "timesheet")
public class TimeSheet {

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "task_description")
    private String taskDescription;

    @Column(name = "task_hours")
    private Integer taskHours;

    @Column(name = "work_date")
    private LocalDate workDate;

    public TimeSheet() {

    }

    public TimeSheet(String email, String firstName, String lastName, String taskDescription, Integer taskHours, LocalDate workDate) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.taskDescription = taskDescription;
        this.taskHours = taskHours;
        this.workDate = workDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Integer getTaskHours() {
        return taskHours;
    }

    public void setTaskHours(Integer taskHours) {
        this.taskHours = taskHours;
    }

    public LocalDate getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDate workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "TimeSheet{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskHours=" + taskHours +
                ", workDate=" + workDate +
                '}';
    }
}
