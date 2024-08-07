package org.factzoopia.zootopia.repository;

import org.factzoopia.zootopia.models.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsRepository extends JpaRepository<Animals, Long>{

    
}