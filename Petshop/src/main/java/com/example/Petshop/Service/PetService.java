package com.example.Petshop.Service;

import com.example.Petshop.domain.tutor.pet.Pet;
import com.example.Petshop.domain.tutor.pet.PetRepository;
import com.example.Petshop.domain.tutor.pet.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public List<Pet> findAll() {
        return petRepository.findAll();
    }
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}