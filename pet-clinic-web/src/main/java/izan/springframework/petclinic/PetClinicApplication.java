package izan.springframework.petclinic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class PetClinicApplication {
	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}
}
