package dev.maxionderon.companiongiftapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gift {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String type;

    public Gift(){}

    public void setType(String type) {

        this.type = type;

    }

    public Long getId() {

        return this.id;

    }

    public String getType() {

        return this.type;

    }

}