package com.test.mobile.middleware.support.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    public String getChauffeurDriveDropOffTime(String tripStartDate){
        LocalDateTime departureDateTime = LocalDateTime.parse(tripStartDate,
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        return getHours(departureDateTime.minusMinutes(150).getHour()) + ":"
                + departureDateTime.minusMinutes(150).getMinute();
    }

    public String getDateInSpecifiedFormat(String tripStartDate){
        LocalDateTime departureDateTime = LocalDateTime.parse(tripStartDate,
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        return departureDateTime.getDayOfMonth() + departureDateTime.getMonth().name().substring(0,3).toUpperCase();
    }

    private String getHours(int duration){
        return String.format("%02d", duration);
    }
}
