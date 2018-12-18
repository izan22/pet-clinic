package izan.springframework.petclinic.bootstrap;

import izan.springframework.petclinic.model.*;
import izan.springframework.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;
    private final PetService petService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        if(petTypeService.findAll().size() == 0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");

        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("Surgery");

        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        radiology.setDescription("Desntistry");

        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michel");
        owner1.setLastName("Weston");
        owner1.setAddress("Calle de la amargura");
        owner1.setCity("Madriz");
        owner1.setTelephone("6555665");

        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveCatPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthday(LocalDate.now());
        mikesPet.setName("Miau");

        petService.save(mikesPet);

        owner1.getPets().add(mikesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Izan");
        owner2.setLastName("Ballesteros");
        owner2.setAddress("Calle republica");
        owner2.setCity("Madriz");
        owner2.setTelephone("6555665");

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(mikesPet);
        catVisit.setLocalDate(LocalDate.now());
        catVisit.setDescription("Gatete");

        visitService.save(catVisit);

        Pet izanPet = new Pet();
        izanPet.setPetType(saveDogPetType);
        izanPet.setOwner(owner2);
        izanPet.setBirthday(LocalDate.now());
        izanPet.setName("Guau");
        owner1.getPets().add(izanPet);

        Vet vet = new Vet();
        vet.setFirstName("Tati");
        vet.setLastName("Peluso");
        vet.getSpecialties().add(savedRadiology);

        vetService.save(vet);

        Vet vetDos = new Vet();
        vetDos.setFirstName("Maria");
        vetDos.setLastName("Algo");
        vet.getSpecialties().add(savedDentistry);

        vetService.save(vetDos);

        Vet vetTres = new Vet();
        vetTres.setFirstName("Ana");
        vetTres.setLastName("Pastor");
        vet.getSpecialties().add(savedSurgery);

        vetService.save(vetTres);
    }
}
