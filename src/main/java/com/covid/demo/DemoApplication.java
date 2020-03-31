package com.covid.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
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
