package org.factzoopia.zootopia.models;

import org.factzoopia.zootopia.models.enums.AnimalsType;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animals{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "animals_type")
    private AnimalsType animalsType;

    

  

    public Animals() {
    }

    public Animals(AnimalsType animalsType) {
        this.animalsType = animalsType;
    }   

    public AnimalsType getAnimalsType() {
        return animalsType;
    }

    public void setAnimalsType(AnimalsType animalsType) {
        this.animalsType = animalsType;
    }

    
   
}