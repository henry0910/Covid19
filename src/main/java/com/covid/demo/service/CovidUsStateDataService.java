package com.covid.demo.service;

import com.covid.demo.models.State;
import org.apache.log4j.Logger;
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
@Qualifier("stateData")
public class CovidUsStateDataService {
    private static final String baseUrl = "https://www.worldometers.info/coronavirus/country/us/";
    private List<State> stateList = new ArrayList<>();

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public List<State> getStateList() {
        List<State> current = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(baseUrl).get();
            Elements table = doc.select("#usa_table_countries_today");
            Elements rows = table.select("tbody").select("tr");
            int idx = 0;
            for (Element element : rows) {
                Elements eachStates = element.select("td");
                if (eachStates == null || eachStates.size() < 6)  {
                    logger.warn("This state record is null or incomplete");
                } else {
                    State s1 = new State();
                    s1.setId(idx++);
                    s1.setState(eachStates.get(0).text());
                    s1.setTotalCases(eachStates.get(1).text());
                    s1.setNewCases(eachStates.get(2).text());
                    s1.setTotalDeaths(eachStates.get(3).text());
                    s1.setNewCases(eachStates.get(4).text());
                    s1.setActiveCases(eachStates.get(5).text());
                    current.add(s1);
                }

            }
            this.stateList = new ArrayList<>(current);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return this.stateList;
    }

    private static Logger logger = Logger.getLogger(CovidUsStateDataService.class);
}
