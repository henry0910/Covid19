package com.covid.demo.controllers;

import com.covid.demo.service.CovidCountryDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CovidCountryDataController {

    @Autowired
    @Qualifier("countryData")
    private CovidCountryDataService covidCountryDataService;

    @GetMapping(value = "/countries", produces = "application/json")
    public String getCountriesInfo() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(covidCountryDataService.getCountryData());
    }

    @GetMapping(value = "/")
    public String home(Model model) {
        return "home";
    }

}
