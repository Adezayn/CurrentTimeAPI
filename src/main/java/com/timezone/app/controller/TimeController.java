package com.timezone.app.controller;

import com.timezone.app.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("/time")
    public String getCurrentTime (@RequestParam("timeZone") String timeZone){
        return  timeService.getCurrentTime(timeZone) ;
    }

}
