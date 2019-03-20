package pl.januszmajdak.employeesmansys.converters;

import pl.januszmajdak.employeesmansys.dto.TimeSheetDto;
import pl.januszmajdak.employeesmansys.entities.TimeSheet;

import java.util.function.Function;

public class TimeSheetDtoConverter implements Function<TimeSheet, TimeSheetDto> {
    @Override
    public TimeSheetDto apply(TimeSheet timeSheet) {
        TimeSheetDto timeSheetDto = new TimeSheetDto(timeSheet.getEmail(), timeSheet.getFirstName(), timeSheet.getLastName(), timeSheet.getTaskDescription(), timeSheet.getTaskHours(), timeSheet.getWorkDate());
        return timeSheetDto;
    }
}
