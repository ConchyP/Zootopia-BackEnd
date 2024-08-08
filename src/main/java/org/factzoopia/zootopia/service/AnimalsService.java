package org.factzoopia.zootopia.service;

import java.util.List;

import org.factzoopia.zootopia.models.Animals;
import org.factzoopia.zootopia.repository.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalsService {

    @Autowired
    private AnimalsRepository repository;

    public List<Animals> getAllAnimals() {
        return repository.findAll();
    }

    public Animals getAnimalsById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Animal not found"));
    }

    public Animals createAnimals(Animals animals) {
        return repository.save(animals);
    }

    public Animals updateAnimals(Animals animals) {
        if (!repository.existsById(animals.getId())) {
            throw new RuntimeException("Animals not found");
        }
        return repository.save(animals);
    }

    public void deleteAnimalsBy(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Animals not found");
        }
    }

}
