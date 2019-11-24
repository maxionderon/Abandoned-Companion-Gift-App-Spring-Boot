package dev.maxionderon.companiongiftapp.model;

import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Type;

@Entity
public class Affiliation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    UUID id;
    String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "affiliations", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    Set<Companion> companions;

    public void setName(String name) {

        this.name = name;

    }

    public UUID getId() {

        return this.id;

    }

    public String getName() {

        return this.name;
        
    }

    public Set<Companion> getCompanions() {

        return this.companions;

    }

    public void removeAffiliationFromCompanions() {

        ArrayList<Companion> companions = new ArrayList<Companion>(this.companions);

        for( int i = 0; i != companions.size(); i = i + 1 ) {

            companions.get(i).affiliations.remove(this);

        }

    }

}