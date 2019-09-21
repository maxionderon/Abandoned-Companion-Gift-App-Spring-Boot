package dev.maxionderon.companiongiftapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GiftReaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    int gainFactor;

    public void setName(String name) {

        this.name = name;

    }

    public void setGainFactor(int gainFactor) {

        this.gainFactor = gainFactor;

    }

    public Long getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public int getGainFactor() {

        return this.gainFactor;

    }
    
}