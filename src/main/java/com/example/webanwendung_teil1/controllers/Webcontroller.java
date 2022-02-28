package com.example.webanwendung_teil1.controllers;

import com.example.webanwendung_teil1.ApplicationService.DateService;
import com.example.webanwendung_teil1.ApplicationService.RestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class Webcontroller {

    private final RestService restService;

    public Webcontroller(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/")
    public String cryptoPrices(Model model, DateService today) throws IOException {
        String date = today.getDate();
        String bitcoinBuyPrice = restService.getBTC_EURPrice();
        String ethereumBuyPrice = restService.getETH_EURPrice();
        model.addAttribute("BTC",bitcoinBuyPrice);
        model.addAttribute("ETH",ethereumBuyPrice);
        model.addAttribute("Greeting",date);
        return "index";
    }

}
