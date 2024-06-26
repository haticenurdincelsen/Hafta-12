package dev.patika.RestAPIGelistirme.repository;

import dev.patika.RestAPIGelistirme.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  PublisherRepository extends JpaRepository<Publisher,Long> {
    Optional<Publisher> findByNameAndEstablishmentYear(String name, Integer year);
}
