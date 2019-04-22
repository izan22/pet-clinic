package izan.springframework.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PetClinicApplication {
	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}
}
