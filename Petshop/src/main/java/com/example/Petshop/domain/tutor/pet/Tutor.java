package com.example.Petshop.domain.tutor.pet;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Entity(name="Tutor")
@NoArgsConstructor
@AllArgsConstructor
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    private String cpf;
    private String nome;
    private String telefone;
    @OneToMany(mappedBy = "tutor")
    private List<Pet> pets;

}

