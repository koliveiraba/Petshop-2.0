package com.example.Petshop.domain.tutor.pet;

import com.example.Petshop.domain.tutor.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface PetRepository extends JpaRepository<Pet, Long> {
}
