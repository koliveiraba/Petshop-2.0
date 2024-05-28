package com.example.Petshop.controllers;

import com.example.Petshop.Service.PetService;
import com.example.Petshop.domain.tutor.pet.Pet;
import com.example.Petshop.domain.tutor.pet.PetRepository;
import com.example.Petshop.domain.tutor.pet.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    PetService petservice;

    @GetMapping
    public List<Pet> findAll() {
        return petservice.findAll();
    }

    @PostMapping
    public Pet save(@RequestBody Pet pet) {
        return petservice.save(pet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        petservice.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
