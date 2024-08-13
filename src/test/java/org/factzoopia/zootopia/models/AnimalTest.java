package org.factzoopia.zootopia.models;

import org.junit.jupiter.api.Test;
import org.factzoopia.zootopia.models.enums.AnimalType;


import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;

public class AnimalTest {

    @Test
    public void testAnimalGettersAndSetters() {
        
        Animal animal = new Animal();
        

        Long id = 1L;
        AnimalType animalType = AnimalType.Feline; 
        String specie = "Lion";
        String name = "Simba";
        char gender = 'M';
        LocalDate date = LocalDate.of(2024, 8, 13);
        
        animal.setId(id);
        animal.setAnimalsType(animalType);
        animal.setSpecie(specie);
        animal.setName(name);
        animal.setGender(gender);
        animal.setDate(date);

        assertThat(animal.getId()).isEqualTo(id);
        assertThat(animal.getAnimalsType()).isEqualTo(animalType);
        assertThat(animal.getSpecie()).isEqualTo(specie);
        assertThat(animal.getName()).isEqualTo(name);
        assertThat(animal.getGender()).isEqualTo(gender);
        assertThat(animal.getDate()).isEqualTo(date);
    }

    @Test
    public void testAnimalConstructor() {
        
        Long id = 1L;
        AnimalType animalType = AnimalType.Reptile; 
        String specie = "Caiman";
        String name = "Wally";
        char gender = 'M';
        LocalDate date = LocalDate.of(2024, 8, 13);

        Animal animal = new Animal(id, animalType, specie, name, gender, date);

        assertThat(animal.getId()).isEqualTo(id);
        assertThat(animal.getAnimalsType()).isEqualTo(animalType);
        assertThat(animal.getSpecie()).isEqualTo(specie);
        assertThat(animal.getName()).isEqualTo(name);
        assertThat(animal.getGender()).isEqualTo(gender);
        assertThat(animal.getDate()).isEqualTo(date);
    }

}
