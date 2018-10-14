package izan.springframework.petclinic.services;

import izan.springframework.petclinic.model.Pet;
import izan.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet owner);

    Set<Vet> findAll();
}
