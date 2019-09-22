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

import dev.maxionderon.companiongiftapp.model.GiftType;
import dev.maxionderon.companiongiftapp.model.GiftTypeRepository;

@RestController
public class GiftTypeController {

    @Autowired
    private GiftTypeRepository giftTypeRepository;

    @RequestMapping("/giftType/controller")
    String giftController() {

        return "GiftType Controller";

    }

    @GetMapping("/giftType")
    List<GiftType> getGifts() {

        return (List<GiftType>)giftTypeRepository.findAll();

    }

    @PostMapping("/giftType")
    List<GiftType> postGift(@RequestBody GiftType giftType) {

        this.giftTypeRepository.save(giftType);

        return (List<GiftType>)giftTypeRepository.findAll();

    }
 
    @PutMapping("/giftType/{id}")
    List<GiftType> putGift(@PathVariable("id") Long id, @RequestBody GiftType giftType) {

        GiftType repoGiftType = this.giftTypeRepository.findById(id).get();
        
        repoGiftType.setType(giftType.getType());

        this.giftTypeRepository.save(repoGiftType);

        return (List<GiftType>)giftTypeRepository.findAll();

    }

    @DeleteMapping("/giftType/{id}")
    List<GiftType> deleteGift(@PathVariable("id") Long id) {

        this.giftTypeRepository.deleteById(id);

        return (List<GiftType>)giftTypeRepository.findAll();

    }

}