package pl.januszmajdak.employeesmansys.dto;

import javax.persistence.Column;
import java.time.LocalDate;


public class LeaveDto {

    private String email;
    private String description;
    private LocalDate startLeaveDate;
    private LocalDate finishLeaveDate;
    private String leaveStatus;

    public LeaveDto() {

    }

    public LeaveDto(String email, String description, LocalDate startLeaveDate, LocalDate finishLeaveDate, String leaveStatus) {
        this.email = email;
        this.description = description;
        this.startLeaveDate = startLeaveDate;
        this.finishLeaveDate = finishLeaveDate;
        this.leaveStatus = leaveStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartLeaveDate() {
        return startLeaveDate;
    }

    public void setStartLeaveDate(LocalDate startLeaveDate) {
        this.startLeaveDate = startLeaveDate;
    }

    public LocalDate getFinishLeaveDate() {
        return finishLeaveDate;
    }

    public void setFinishLeaveDate(LocalDate finishLeaveDate) {
        this.finishLeaveDate = finishLeaveDate;
    }

    public String getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(String leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

    @Override
    public String toString() {
        return "LeaveDto{" +
                "email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", startLeaveDate=" + startLeaveDate +
                ", finishLeaveDate=" + finishLeaveDate +
                ", leaveStatus='" + leaveStatus + '\'' +
                '}';
    }
}
