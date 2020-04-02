package com.covid.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Country {
    private Integer id;
    private String country;
    private String totalCases;
    private String newCases;
    private String totalDeaths;
    private String newDeaths;
    private String totalRecovered;
    private String activeCases;
    private String seriesCases;
    private String totalCasesPerMillionPop;
    private String totalDeathsPerMillionPop;
    private String reportedFirstCase;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    public String getSeriesCases() {
        return seriesCases;
    }

    public void setSeriesCases(String seriesCases) {
        this.seriesCases = seriesCases;
    }

    public String getTotalCasesPerMillionPop() {
        return totalCasesPerMillionPop;
    }

    public void setTotalCasesPerMillionPop(String totalCasesPerMillionPop) {
        this.totalCasesPerMillionPop = totalCasesPerMillionPop;
    }

    public String getTotalDeathsPerMillionPop() {
        return totalDeathsPerMillionPop;
    }

    public void setTotalDeathsPerMillionPop(String totalDeathsPerMillionPop) {
        this.totalDeathsPerMillionPop = totalDeathsPerMillionPop;
    }

    public String getReportedFirstCase() {
        return reportedFirstCase;
    }

    public void setReportedFirstCase(String reportedFirstCase) {
        this.reportedFirstCase = reportedFirstCase;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", totalCases='" + totalCases + '\'' +
                ", newCases='" + newCases + '\'' +
                ", totalDeaths='" + totalDeaths + '\'' +
                ", newDeaths='" + newDeaths + '\'' +
                ", totalRecovered='" + totalRecovered + '\'' +
                ", activeCases='" + activeCases + '\'' +
                ", seriesCases='" + seriesCases + '\'' +
                ", totalCasesPerMillionPop='" + totalCasesPerMillionPop + '\'' +
                ", totalDeathsPerMillionPop='" + totalDeathsPerMillionPop + '\'' +
                ", reportedFirstCase='" + reportedFirstCase + '\'' +
                '}';
    }
}
