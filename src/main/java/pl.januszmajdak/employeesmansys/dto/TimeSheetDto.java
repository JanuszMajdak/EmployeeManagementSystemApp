package pl.januszmajdak.employeesmansys.dto;

import java.time.LocalDate;


public class TimeSheetDto {

    private String email;
    private String firstName;
    private String lastName;
    private String taskDescription;
    private Integer taskHours;
    private LocalDate workDate;

    public TimeSheetDto(){

    }

    public TimeSheetDto(String email, String firstName, String lastName, String taskDescription, Integer taskHours, LocalDate workDate) {
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
}
