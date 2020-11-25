package com.ninja.controllers;

import com.ninja.models.LocationStats;
import com.ninja.services.CoronavirusVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronavirusVirusDataService coronavirusVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("testName", "Hello Test Model");
        model.addAttribute("testVariable", "This is a Test Variable");

        // coronavirusVirusDataService.getAllStats() gets back a list
        List<LocationStats> allStats = coronavirusVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPreviousDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "Home";
    }
}
