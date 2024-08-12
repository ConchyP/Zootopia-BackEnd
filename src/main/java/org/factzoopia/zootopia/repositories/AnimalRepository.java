package org.factzoopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.factzoopia.zootopia.models.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

}