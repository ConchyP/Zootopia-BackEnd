package org.factzoopia.zootopia.models;

import java.time.LocalDate;

import org.factzoopia.zootopia.models.enums.AnimalType;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "animal_type")
    @Enumerated(EnumType.STRING)
    private AnimalType animalType;

    @Column(name= "specie")
    private String specie;

    @Column(name= "name")
    private String name;

    @Column(name= "gender")
    private char gender;

    @Column(name= "date")
    private LocalDate date;
 
    public Animal() {
    }

    public Animal(Long id, AnimalType animalsType, String specie, String name, char gender, LocalDate date) {
        this.id = id;
        this.animalType = animalsType;
        this.specie = specie;
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AnimalType getAnimalsType() {
        return animalType;
    }

    public void setAnimalsType(AnimalType animalsType) {
        this.animalType = animalsType;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}