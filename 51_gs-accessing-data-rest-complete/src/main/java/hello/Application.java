package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner init(PersonRepository personRepository) {
		
		String[][] data = {
				{"José", "García Martínez"},
				{"Manuel", "Pérez Díaz"},
				{"Luis Miguel", "López Magaña"},
				{"Alberto", "Jiménez Sarmiento"},
				{"Carlos", "Ruiz Santos"},
				{"Martín", "López Alfaro"},
				{"María", "Martínez Sánchez"},
				{"Luisa", "Milán Llanes"}
		};
		
		
		
		return (evt) -> Arrays.asList(data)
				.forEach(a -> {
			
						Person p = new Person();
						p.setFirstName(a[0]);
						p.setLastName(a[1]);
						personRepository.save(p);
					
				});
				
		
	}
	
	
	
}
