package dev.maxionderon.companiongiftapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.maxionderon.companiongiftapp.model.Affiliation;
import dev.maxionderon.companiongiftapp.model.AffiliationRepository;;

@RestController
public class AffiliationController {

    @Autowired
    private AffiliationRepository affiliationRepository;

    @RequestMapping("/affiliation/controller")
    String affiliationController() {

        return "Affiliation Controller";

    }

    @GetMapping("/affiliation")
    List<Affiliation> getAffiliations() {

        return (List<Affiliation>) this.affiliationRepository.findAll();

    }

    @PostMapping("/affiliation")
    List<Affiliation> postAffiliations(@RequestBody Affiliation affiliation) {

        this.affiliationRepository.save(affiliation);

        return (List<Affiliation>) this.affiliationRepository.findAll();

    }

}