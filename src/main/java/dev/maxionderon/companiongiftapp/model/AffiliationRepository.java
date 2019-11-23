package dev.maxionderon.companiongiftapp.model;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface AffiliationRepository extends CrudRepository<Affiliation, UUID> {

}