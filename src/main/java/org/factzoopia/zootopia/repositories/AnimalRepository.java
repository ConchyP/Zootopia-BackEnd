package org.factzoopia.zootopia.repositories;

import java.util.List;

import org.factzoopia.zootopia.models.Animal;
import org.factzoopia.zootopia.models.enums.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT COUNT(a) FROM Animal a WHERE a.animalType = :animalType")
    long countByAnimalType(@Param("animalType") AnimalType animalType);
    
    List<Animal> findByAnimalType(AnimalType animalType);

}