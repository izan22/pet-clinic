package izan.springframework.petclinic.services;

import izan.springframework.petclinic.model.Owner;
import izan.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet owner);

    Set<Pet> findAll();
}
