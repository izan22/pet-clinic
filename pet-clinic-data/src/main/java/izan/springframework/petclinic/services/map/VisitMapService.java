package izan.springframework.petclinic.services.map;

import izan.springframework.petclinic.model.Visit;
import izan.springframework.petclinic.services.PetService;
import izan.springframework.petclinic.services.PetTypeService;
import izan.springframework.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public VisitMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet() == null
                || object.getPet().getOwner() == null
                || object.getPet().getId() == null
                || object.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");

        }
        return super.save(object);
    }

    @Override
    public Visit finById(Long aLong) {
        return super.findById(aLong);
    }
}
