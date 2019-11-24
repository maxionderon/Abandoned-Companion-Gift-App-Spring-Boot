package dev.maxionderon.companiongiftapp.model;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface CompanionRepository extends CrudRepository<Companion, UUID> {
    
}