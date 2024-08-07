package org.factzoopia.zootopia.models;

import org.factzoopia.zootopia.models.enums.AnimalsType;

public class Animals{

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