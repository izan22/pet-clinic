package izan.springframework.petclinic.model.repositories;

import izan.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long > {
    Owner findByLastName(String lastName);
}
