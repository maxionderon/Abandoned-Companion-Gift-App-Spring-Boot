package dev.maxionderon.companiongiftapp.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CompanionGift {

    @Id
    @GeneratedValue
    UUID id;
    Boolean romancedReaction;
    @ManyToOne
    @JoinColumn(name = "gift_type_id")
    GiftType giftType;
    @ManyToOne
    @JoinColumn(name = "gift_reaction_id")
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

    public UUID getId() {

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