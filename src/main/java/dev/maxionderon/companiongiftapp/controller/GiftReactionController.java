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

import dev.maxionderon.companiongiftapp.model.GiftReaction;
import dev.maxionderon.companiongiftapp.model.GiftReactionRepository;

@RestController
public class GiftReactionController {

    @Autowired
    private GiftReactionRepository giftReactionRepository;

    @RequestMapping("/giftReaction/controller")
    String giftReactionController() {

        return "GiftReaction Controller";

    }

    @GetMapping("/giftReaction")
    List<GiftReaction> getGiftReactions() {

        return (List<GiftReaction>) this.giftReactionRepository.findAll();

    }

    @PostMapping("/giftReaction")
    List<GiftReaction> postGiftReaction(@RequestBody GiftReaction giftReaction) {

        this.giftReactionRepository.save(giftReaction);

        return (List<GiftReaction>) this.giftReactionRepository.findAll();

    }
    
    @PutMapping("/giftReaction/{id}")
    List<GiftReaction> putGiftReaction(@PathVariable("id") Long id, @RequestBody GiftReaction giftReaction) {

        GiftReaction repoGiftReaction = this.giftReactionRepository.findById(id).get();

        repoGiftReaction.setName(giftReaction.getName());
        repoGiftReaction.setGainFactor(giftReaction.getGainFactor());

        this.giftReactionRepository.save(repoGiftReaction);

        return (List<GiftReaction>) this.giftReactionRepository.findAll();

    }

    @DeleteMapping("/giftReaction/{id}")
    List<GiftReaction> deleteGiftReaction(@PathVariable("id") Long id) {

        this.giftReactionRepository.deleteById(id);

        return (List<GiftReaction>) this.giftReactionRepository.findAll();

    }

}