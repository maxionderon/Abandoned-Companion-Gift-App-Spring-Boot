package dev.maxionderon.companiongiftapp.model;

import org.springframework.data.repository.CrudRepository;

import dev.maxionderon.companiongiftapp.model.Gift;

public interface GiftRepository extends CrudRepository<Gift, Long> {
    
}