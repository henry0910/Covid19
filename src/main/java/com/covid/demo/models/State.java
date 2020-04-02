package com.covid.demo.models;

import org.springframework.stereotype.Component;

@Component
public class State {
    private Integer id;
    private String state;
    private String totalCases;
    private String newCases;
    private String totalDeaths;
    private String newDeaths;
    private String activeCases;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", totalCases='" + totalCases + '\'' +
                ", newCases='" + newCases + '\'' +
                ", totalDeaths='" + totalDeaths + '\'' +
                ", newDeaths='" + newDeaths + '\'' +
                ", activeCases='" + activeCases + '\'' +
                '}';
    }
}
