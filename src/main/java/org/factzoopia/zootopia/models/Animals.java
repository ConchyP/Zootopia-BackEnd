package org.factzoopia.zootopia.models;

import org.factzoopia.zootopia.models.enums.Canines;
import org.factzoopia.zootopia.models.enums.Felines;
import org.factzoopia.zootopia.models.enums.Leporidae;
import org.factzoopia.zootopia.models.enums.Mustelides;
import org.factzoopia.zootopia.models.enums.Reptiles;

public class Animals{

    private Felines felines;
    private Canines canines;
    private Reptiles reptiles;
    private Mustelides mustelides;
    private Leporidae leporidae;

    public Animals(){
        
    }

    public Animals(Felines felines, Canines canines, Reptiles reptiles, Mustelides mustelides, Leporidae leporidae) {
        this.felines = felines;
        this.canines = canines;
        this.reptiles = reptiles;
        this.mustelides = mustelides;
        this.leporidae = leporidae;
    }

    public Felines getFelines() {
        return felines;
    }

    public void setFelines(Felines felines) {
        this.felines = felines;
    }

    public Canines getCanines() {
        return canines;
    }

    public void setCanines(Canines canines) {
        this.canines = canines;
    }

    public Reptiles getReptiles() {
        return reptiles;
    }

    public void setReptiles(Reptiles reptiles) {
        this.reptiles = reptiles;
    }

    public Mustelides getMustelides() {
        return mustelides;
    }

    public void setMustelides(Mustelides mustelides) {
        this.mustelides = mustelides;
    }

    public Leporidae getLeporidae() {
        return leporidae;
    }

    public void setLeporidae(Leporidae leporidae) {
        this.leporidae = leporidae;
    }
}