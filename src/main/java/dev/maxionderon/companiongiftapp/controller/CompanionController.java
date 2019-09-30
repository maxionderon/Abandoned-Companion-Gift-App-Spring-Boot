package dev.maxionderon.companiongiftapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.maxionderon.companiongiftapp.model.*;

@RestController
@RequestMapping("/companion")
public class CompanionController {

    @Autowired
    private CompanionRepository companionRepository;

    @RequestMapping("/controller")
    public String companionController() {

        return "Companion Controller";

    }

    @GetMapping("")
    public List<Companion> getCompanions() {

        return (List<Companion>) this.companionRepository.findAll();

    }

    @PostMapping("")
    public List<Companion> postCompanion(@RequestBody Companion companion) {

        this.companionRepository.save(companion);

        return (List<Companion>) this.companionRepository.findAll();
    }

}