package com.covid.demo.controllers;

import com.covid.demo.service.CovidCountryDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidCountryDataController {

    @GetMapping("/countries")
    public String getCountriesInfo(@Autowired @Qualifier("countryData") CovidCountryDataService covidCountryDataService) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(covidCountryDataService.getCountryData());
    }


}
