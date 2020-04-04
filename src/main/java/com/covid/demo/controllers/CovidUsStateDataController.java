package com.covid.demo.controllers;

import com.covid.demo.service.CovidUsStateDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidUsStateDataController {

    @GetMapping(value = "/country/us/", produces = "application/json")
    public String getStatesInfo(@Autowired @Qualifier("stateData" )CovidUsStateDataService covidUsStateDataService) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(covidUsStateDataService.getStateList());
    }
}
