package dev.maxionderon.companiongiftapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompanionGift {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Boolean romancedReaction;
    @OneToOne
    GiftType giftType;
    @OneToOne
    GiftReaction giftReaction;

    public CompanionGift() { }

    public void setRomancedReaction(Boolean romancedReaction) {

        this.romancedReaction = romancedReaction;

    }

    public void setGiftType(GiftType giftType) {

        this.giftType = giftType;

    }

    public void setGiftReaction(GiftReaction giftReaction) {

        this.giftReaction = giftReaction;

    }

    public Long getId() {

        return this.id;

    }

    public Boolean getRomancedReaction() {

        return this.romancedReaction;
        
    }

    public GiftReaction getGiftReaction() {

        return this.giftReaction;

    }

    public GiftType getGiftType() {

        return this.giftType;

    }

}