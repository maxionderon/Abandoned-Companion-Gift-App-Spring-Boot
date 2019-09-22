package dev.maxionderon.companiongiftapp.model;

import java.util.Set;

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
    Set<Affiliation> affiliations;
    @OneToMany
    Set<CompanionGift> companionGifts;
    

}