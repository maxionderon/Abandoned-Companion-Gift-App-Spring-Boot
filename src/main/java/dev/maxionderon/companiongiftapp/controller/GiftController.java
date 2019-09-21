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

import dev.maxionderon.companiongiftapp.model.Gift;
import dev.maxionderon.companiongiftapp.model.GiftRepository;

@RestController
public class GiftController {

    @Autowired
    private GiftRepository giftRepository;

    @RequestMapping("/gift/controller")
    String giftController() {

        return "Gift Controller";

    }

    @GetMapping("/gift")
    List<Gift> getGifts() {

        return (List<Gift>)giftRepository.findAll();

    }

    @PostMapping("/gift")
    List<Gift> postGift(@RequestBody Gift gift) {

        this.giftRepository.save(gift);

        return (List<Gift>)giftRepository.findAll();

    }
 
    @PutMapping("/gift/{id}")
    List<Gift> putGift(@PathVariable("id") Long id, @RequestBody Gift gift) {

        Gift repoGift = this.giftRepository.findById(id).get();
        
        repoGift.setType(gift.getType());

        this.giftRepository.save(repoGift);

        return (List<Gift>)giftRepository.findAll();

    }

    @DeleteMapping("/gift/{id}")
    List<Gift> deleteGift(@PathVariable("id") Long id) {

        this.giftRepository.deleteById(id);

        return (List<Gift>)giftRepository.findAll();

    }

}