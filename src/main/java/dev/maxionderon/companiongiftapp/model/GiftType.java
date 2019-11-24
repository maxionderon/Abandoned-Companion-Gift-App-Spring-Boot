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
public class GiftType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    UUID id;
    String type;

    @JsonIgnore
    @OneToMany( cascade = { CascadeType.ALL} )
    @JoinColumn( name = "gift_type_id")
    Set<CompanionGift> companionGifts;

    public GiftType(){}

    public void setType(String type) {

        this.type = type;

    }

    public UUID getId() {

        return this.id;

    }

    public String getType() {

        return this.type;

    }

    public Set<CompanionGift> getCompanionGifts() {

        return this.companionGifts;
        
    }

}