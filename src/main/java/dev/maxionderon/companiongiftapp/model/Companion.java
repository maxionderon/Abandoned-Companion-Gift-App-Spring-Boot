package dev.maxionderon.companiongiftapp.model;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Companion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String description;
    @OneToMany
    List<Affiliation> affiliations;
    @OneToMany
    List<CompanionGift> gifts;

    public Companion() {

        this.affiliations = new ArrayList<Affiliation>() ;
        this.gifts = new ArrayList<CompanionGift>();

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setAffiliations( List<Affiliation> affiliations ) {

        this.affiliations = affiliations;

    }

    public void setGifts(List<CompanionGift> gifts ) {

        this.gifts = gifts;

    }

    public Long getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public List<Affiliation> getAffiliations() {

        return this.affiliations;

    }

    public List<CompanionGift> getGifts() {

        return this.gifts;

    }   

}