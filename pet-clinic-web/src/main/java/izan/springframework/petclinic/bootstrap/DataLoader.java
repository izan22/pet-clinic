package izan.springframework.petclinic.bootstrap;

import izan.springframework.petclinic.model.Owner;
import izan.springframework.petclinic.model.Vet;
import izan.springframework.petclinic.services.OwnerService;
import izan.springframework.petclinic.services.VetService;
import izan.springframework.petclinic.services.map.OwnerMapService;
import izan.springframework.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

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
