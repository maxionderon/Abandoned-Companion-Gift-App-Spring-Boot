package dev.maxionderon.companiongiftapp.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("/{id}")
    public List<Companion> putCompanion(@PathVariable("id") UUID id, @RequestBody Companion companion) {

        Companion repoCompanion = this.companionRepository.findById(id).get();

        repoCompanion.setName(companion.getName());
        repoCompanion.setDescription(companion.getDescription());
        repoCompanion.setAffiliations(companion.getAffiliations());
        repoCompanion.setGifts(companion.getGifts());

        this.companionRepository.save(repoCompanion);

        return (List<Companion>) this.companionRepository.findAll();

    }


    @DeleteMapping("/{id}")
    public List<Companion> deleteCompanion(@PathVariable("id") UUID id) {

        this.companionRepository.deleteById(id);

        return (List<Companion>) this.companionRepository.findAll();

    }

}