package com.example.bikerent;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public class BikeRepository {
    private final EntityManager entityManager;

    public BikeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Bike bike) {
        entityManager.persist(bike);
    }

    public Optional<Bike> findById(long id) {
        return Optional.ofNullable(entityManager.find(Bike.class, id));
    }

    @Transactional
    public void deleteById(long id) {
        //entityManager.remove(Optional.ofNullable(entityManager.find(Bike.class, id)));
        findById(id).ifPresent(entityManager::remove);
    }
}
