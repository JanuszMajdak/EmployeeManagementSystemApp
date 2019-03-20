package pl.januszmajdak.employeesmansys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;



@Entity
@Table(name="leaves")
public class Leave {

    @Column (name="email")
    private String email;

    @Column (name="description")
    private String description;

    @Column (name="start_leave_date")
    private LocalDate startLeaveDate;

    @Column (name="finish_leave_date")
    private LocalDate finishLeaveDate;

    @Column (name="status")
    private String leaveStatus;


    public Leave(){

    }

    public Leave(String email, String description, LocalDate startLeaveDate, LocalDate finishLeaveDate, String leaveStatus) {
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
        return "Leave{" +
                "email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", startLeaveDate=" + startLeaveDate +
                ", finishLeaveDate=" + finishLeaveDate +
                ", leaveStatus='" + leaveStatus + '\'' +
                '}';
    }
}
