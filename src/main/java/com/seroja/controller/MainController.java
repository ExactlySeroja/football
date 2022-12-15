package com.seroja.controller;

import com.seroja.domain.MatchInfo;
import com.seroja.repos.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class MainController {
    @Autowired
    private MatchRepo matchRepo;

    @GetMapping({"/main"})
    public String greeting() {

        return "redirect:/print";
    }
    @PostMapping(path="/add")
    public String addNewMatch (@RequestParam String firstCountry, @RequestParam String secondCountry,
                               @RequestParam("date") LocalDate date) {
        MatchInfo match = new MatchInfo();
        match.setFirstCountry(firstCountry);
        match.setSecondCountry(secondCountry);
        match.setDate(date);
        matchRepo.save(match);
        return "redirect:/main";
    }

    @GetMapping(path="/print")
    public String getAllMatches(Model model) {
        Iterable<MatchInfo> matchInfos = matchRepo.findAll();
        model.addAttribute("matches", matchInfos);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        matchRepo.deleteById(id);
        return "redirect:/main";
    }
}