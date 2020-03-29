package com.covid.demo.parser;

import com.covid.demo.models.MainNumberCounter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class Scraper {
    private static final String baseUrl = "https://www.worldometers.info/coronavirus/";
    public static void main(String[] args) {
        WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions().setCssEnabled(false);
        client.getOptions().setUseInsecureSSL(true);

        try {
            HtmlPage page = client.getPage(baseUrl);
            List<HtmlElement> mainNumber = page.getByXPath("//div[@class='maincounter-number']");
            MainNumberCounter n1 = new MainNumberCounter();
            n1.setUuid(UUID.randomUUID());
            if (mainNumber != null && !mainNumber.isEmpty()) {

                int idx = 0;
                for (HtmlElement element : mainNumber) {
                    List<HtmlElement> children = element.getByXPath(".//span");
                    String text = children.get(0).getTextContent().strip().replaceAll(",", "");
                    if (idx == 0) {
                        n1.setTotal(Integer.parseInt(text));
                    }
                    if (idx == 1) {
                        n1.setDeaths(Integer.parseInt(text));
                    }
                    if (idx == 2) {
                        n1.setRecovered(Integer.parseInt(text));
                    }
                    idx++;
                }
            } else System.out.println("Nothing found");
            ObjectMapper mapper = new ObjectMapper();
            String jsonStr = mapper.writeValueAsString(n1);
            System.out.println(jsonStr);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
