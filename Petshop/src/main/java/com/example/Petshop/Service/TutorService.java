package com.example.Petshop.Service;

import com.example.Petshop.domain.tutor.pet.Tutor;
import com.example.Petshop.domain.tutor.pet.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public List<Tutor> findAll() {
        return tutorRepository.findAll();
    }
    public Optional<Tutor> findById(Long id) {
        return tutorRepository.findById(id);
    }

    public Optional<Tutor> findByCpf(String cpf) {
        return tutorRepository.findByCpf(cpf);
    }

    public Tutor save(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public void deleteById(Long id) {
        tutorRepository.deleteById(id);
    }

    public void deleteByCpf(String cpf) {
        Optional<Tutor> tutor = tutorRepository.findByCpf(cpf);
        tutor.ifPresent(value -> tutorRepository.deleteById(value.getId()));
    }
}
