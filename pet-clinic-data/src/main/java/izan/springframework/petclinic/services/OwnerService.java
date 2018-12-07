package izan.springframework.petclinic.services;

import izan.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLasName(String lasName);
}
