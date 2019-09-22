package dev.maxionderon.companiongiftapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Affiliation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    public void setName(String name) {

        this.name = name;

    }

    public Long getId() {

        return this.id;

    }

    public String getName() {

        return this.name;
        
    }

}