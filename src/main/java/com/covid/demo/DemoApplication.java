package com.covid.demo;

import com.covid.demo.parser.Scraper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping("/api/v1/total")
//	 public String getMainNumberCounterByTotal() {
//		return Scraper.getMainNumberCounterByTotal();
//	 }
//
//	 @GetMapping(path = "/api/v1/country/{country}")
//	 public String getMainNumberCounterByCountry(@PathVariable("country") String country) {
//		return Scraper.getMainNumberCounterByCountry(country);
//	 }

//	 public String getMainNumberCounterByCountry() {
//
//	 }

}
