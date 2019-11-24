package dev.maxionderon.companiongiftapp.model;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Type;

@Entity
public class GiftReaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    UUID id;
    String name;
    int gainFactor;

    @JsonIgnore
    @OneToMany( cascade = { CascadeType.ALL } )
    @JoinColumn(name = "gift_reaction_id")
    Set<CompanionGift> companionGifts;

    public void setName(String name) {

        this.name = name;

    }

    public void setGainFactor(int gainFactor) {

        this.gainFactor = gainFactor;

    }

    public UUID getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public int getGainFactor() {

        return this.gainFactor;

    }

    public Set<CompanionGift> getCompanionGifts() {

        return this.companionGifts;

    }
    
}