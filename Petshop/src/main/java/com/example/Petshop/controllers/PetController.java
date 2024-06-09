package com.example.Petshop.controllers;

import com.example.Petshop.Service.PetService;
import com.example.Petshop.domain.tutor.pet.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
