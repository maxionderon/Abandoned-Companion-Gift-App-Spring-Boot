package dev.maxionderon.companiongiftapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.maxionderon.companiongiftapp.model.Affiliation;
import dev.maxionderon.companiongiftapp.model.AffiliationRepository;;

@RestController
@RequestMapping("/affiliation")
public class AffiliationController {

    @Autowired
    private AffiliationRepository affiliationRepository;

    @RequestMapping("/controller")
    String affiliationController() {

        return "Affiliation Controller";

    }

    @GetMapping("")    
    List<Affiliation> getAffiliations() {

        return (List<Affiliation>) this.affiliationRepository.findAll();

    }

    @PostMapping("")
    List<Affiliation> postAffiliations(@RequestBody Affiliation affiliation) {

        this.affiliationRepository.save(affiliation);

        return (List<Affiliation>) this.affiliationRepository.findAll();

    }

    @PutMapping("/{id}")
    List<Affiliation> putAffiliation(@PathVariable("id") Long id, @RequestBody Affiliation affiliation) {

        Affiliation repoAffiliation = this.affiliationRepository.findById(id).get();

        repoAffiliation.setName(affiliation.getName());

        this.affiliationRepository.save(repoAffiliation);
    
        return (List<Affiliation>) this.affiliationRepository.findAll();

    }

    @DeleteMapping("/{id}")
    List<Affiliation> deleteAffiliation(@PathVariable("id") Long id) {

        Affiliation affiliation = this.affiliationRepository.findById(id).get();

        affiliation.removeAffiliationFromCompanions();

        this.affiliationRepository.save(affiliation);

        this.affiliationRepository.deleteById(id);

        return (List<Affiliation>) this.affiliationRepository.findAll();

    }

}