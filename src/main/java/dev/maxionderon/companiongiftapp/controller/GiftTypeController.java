package dev.maxionderon.companiongiftapp.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.maxionderon.companiongiftapp.model.GiftType;
import dev.maxionderon.companiongiftapp.model.GiftTypeRepository;

@RestController
@RequestMapping("/giftType")
public class GiftTypeController {

    @Autowired
    private GiftTypeRepository giftTypeRepository;

    @RequestMapping("/controller")
    String giftController() {

        return "GiftType Controller";

    }

    @GetMapping("")
    List<GiftType> getGifts() {

        return (List<GiftType>)giftTypeRepository.findAll();

    }

    @PostMapping("")
    List<GiftType> postGift(@RequestBody GiftType giftType) {

        this.giftTypeRepository.save(giftType);

        return (List<GiftType>)giftTypeRepository.findAll();

    }
 
    @PutMapping("/{id}")
    List<GiftType> putGift(@PathVariable("id") UUID id, @RequestBody GiftType giftType) {

        GiftType repoGiftType = this.giftTypeRepository.findById(id).get();
        
        repoGiftType.setType(giftType.getType());

        this.giftTypeRepository.save(repoGiftType);

        return (List<GiftType>)giftTypeRepository.findAll();

    }

    @DeleteMapping("/{id}")
    List<GiftType> deleteGift(@PathVariable("id") UUID id) {

        this.giftTypeRepository.deleteById(id);

        return (List<GiftType>)giftTypeRepository.findAll();

    }

}