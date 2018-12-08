package izan.springframework.petclinic.bootstrap;

import izan.springframework.petclinic.model.Owner;
import izan.springframework.petclinic.model.PetType;
import izan.springframework.petclinic.model.Vet;
import izan.springframework.petclinic.services.OwnerService;
import izan.springframework.petclinic.services.PetTypeService;
import izan.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michel");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Izan");
        owner2.setLastName("Ballesteros");

        ownerService.save(owner2);

        Vet vet = new Vet();
        vet.setFirstName("Tati");
        vet.setLastName("Peluso");

        vetService.save(vet);

        Vet vetDos = new Vet();
        vetDos.setFirstName("Maria");
        vetDos.setLastName("Algo");

        vetService.save(vetDos);

        Vet vetTres = new Vet();
        vetTres.setFirstName("Ana");
        vetTres.setLastName("Pastor");

        vetService.save(vetTres);
    }
}
