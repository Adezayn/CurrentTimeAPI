package com.timezone.app.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class TimeService {

    public String getCurrentTime(String timeZone){

        try{
            LocalTime currentTime = null;

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String time = "";

            if(timeZone.isEmpty()){
                currentTime =  LocalTime.now();
            }else{
                currentTime = LocalTime.now(ZoneId.of(timeZone)) ;
            }

            time = currentTime.format(formatter);
            return time;

        }catch(Exception ex){
            return "Please use a valid time zone.";
        }

    }
}
