package com.covid.demo.service;

import com.covid.demo.models.Country;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("countryData")
public class CovidCountryDataService {

    private static final String baseUrl = "https://www.worldometers.info/coronavirus/";
    private List<Country> countryList = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public List<Country> getCountryData() {
        List<Country> countryStats = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(baseUrl).get();
            Elements table = doc.select("#main_table_countries_today");
            Elements rows = table.select("tbody").select("tr");
            int idx = 0;
            for (Element row : rows) {
                Elements eachCountry = row.select("td");
                if (eachCountry == null || eachCountry.isEmpty()) {
                    continue;
                } else {
                    Country curr = new Country();
                    curr.setId(idx++);
                    curr.setCountry(eachCountry.get(0).text());
                    curr.setTotalCases(eachCountry.get(1).text());
                    curr.setNewCases(eachCountry.get(2).text());
                    curr.setTotalDeaths(eachCountry.get(3).text());
                    curr.setNewDeaths(eachCountry.get(4).text());
                    curr.setTotalRecovered(eachCountry.get(5).text());
                    curr.setActiveCases(eachCountry.get(6).text());
                    curr.setSeriesCases(eachCountry.get(7).text());
                    curr.setTotalCasesPerMillionPop(eachCountry.get(8).text());
                    curr.setTotalDeathsPerMillionPop(eachCountry.get(9).text());
                    countryStats.add(curr);
                }
            }
            this.countryList = new ArrayList<>(countryStats);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.countryList;
    }

}
