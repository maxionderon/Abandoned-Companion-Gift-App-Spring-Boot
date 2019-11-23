package dev.maxionderon.companiongiftapp.model;

import java.util.Set;
import java.util.UUID;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Companion {

    @Id
    @GeneratedValue
    UUID id;
    String name;
    @Column( columnDefinition = "TEXT")
    String description;
    @ManyToMany( cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable( name = "companion_affiliation_mapping", 
    joinColumns = { @JoinColumn( name = "companion_id")}, inverseJoinColumns = { @JoinColumn(name = "affiliation_id")})
    Set<Affiliation> affiliations;
    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name="companion_id")
    Set<CompanionGift> gifts;

    public Companion() {

        this.affiliations = new HashSet<Affiliation>() ;
        this.gifts = new HashSet<CompanionGift>();

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setAffiliations( Set<Affiliation> affiliations ) {

        this.affiliations = affiliations;

    }

    public void setGifts( Set<CompanionGift> gifts ) {

        this.gifts = gifts;

    }

    public UUID getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public String getDescription() {

        return this.description;
        
    }

    public Set<Affiliation> getAffiliations() {

        return this.affiliations;

    }

    public Set<CompanionGift> getGifts() {

        return this.gifts;

    }   

}