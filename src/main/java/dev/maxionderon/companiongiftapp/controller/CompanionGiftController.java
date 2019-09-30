package dev.maxionderon.companiongiftapp.controller;

import org.springframework.web.bind.annotation.RestController;

import dev.maxionderon.companiongiftapp.model.CompanionGift;
import dev.maxionderon.companiongiftapp.model.CompanionGiftRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/companionGift")
public class CompanionGiftController {

    @Autowired
    private CompanionGiftRepository companionGiftRepository;

    @RequestMapping("/controller")
    String companionGiftController() {

        return "CompanionGift Controller";

    }

    @GetMapping("")
    List<CompanionGift> getCompanionGifts() {

        return (List<CompanionGift>) this.companionGiftRepository.findAll();

    }

    @PostMapping("")
    List<CompanionGift> PostCompanionGift(@RequestBody CompanionGift companionGift) {

        this.companionGiftRepository.save(companionGift);

        return (List<CompanionGift>) this.companionGiftRepository.findAll();

    }

    @PutMapping("/{id}")
    List<CompanionGift> putCompanionGift(@PathVariable("id") Long id, @RequestBody CompanionGift companionGift) {

        CompanionGift repoCompanionGift = this.companionGiftRepository.findById(id).get();

        repoCompanionGift.setRomancedReaction(companionGift.getRomancedReaction());
        repoCompanionGift.setGiftReaction(companionGift.getGiftReaction());
        repoCompanionGift.setGiftType(companionGift.getGiftType());

        return (List<CompanionGift>) this.companionGiftRepository.findAll();

    }

    @DeleteMapping("/{id}")
    List<CompanionGift> deleteCompanionGift(@PathVariable("id") Long id ) {

        this.companionGiftRepository.deleteById(id);

        return (List<CompanionGift>) this.companionGiftRepository.findAll();

    }

}