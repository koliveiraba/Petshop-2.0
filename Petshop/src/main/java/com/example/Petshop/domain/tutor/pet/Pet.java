package com.example.Petshop.domain.tutor.pet;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="Pet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String service;
    private String cor;
    private String raca;
    @Setter
    @ManyToOne
    @JoinColumn(name = "tutor_cpf")
    private Tutor tutor;


}

