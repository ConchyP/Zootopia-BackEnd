package org.factzoopia.zootopia.repositories;

import org.factzoopia.zootopia.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

}