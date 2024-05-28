package com.example.Petshop.controllers;



import com.example.Petshop.Service.TutorService;
import com.example.Petshop.domain.tutor.pet.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tutors")
public class TutorController {
    @Autowired
    private TutorService tutorservice;


    @GetMapping
    public List<Tutor> findAll() {
        return tutorservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tutor> findById(@PathVariable Long id) {
        return tutorservice.findById(id);
    }

    @GetMapping("/cpf/{cpf}")
    public Optional<Tutor> findByCpf(@PathVariable String cpf) {
        return tutorservice.findByCpf(cpf);
    }

    @PostMapping
    public Tutor save(@RequestBody Tutor tutor) {
        return tutorservice.save(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tutorservice.deleteById(id);
    }

    @DeleteMapping("/cpf/{cpf}")
    public void deleteByCpf(@PathVariable String cpf) {
        tutorservice.deleteByCpf(cpf);
    }
}
