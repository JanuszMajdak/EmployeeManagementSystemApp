package pl.januszmajdak.employeesmansys.converters;

import pl.januszmajdak.employeesmansys.dto.LeaveDto;
import pl.januszmajdak.employeesmansys.entities.Leave;

import java.util.function.Function;

public class LeaveDtoConverter implements Function<Leave, LeaveDto> {
    @Override
    public LeaveDto apply(Leave leave) {
        LeaveDto leaveDto = new LeaveDto(leave.getEmail(), leave.getDescription(), leave.getStartLeaveDate(), leave.getFinishLeaveDate(), leave.getLeaveStatus());
        return leaveDto;
    }
}
