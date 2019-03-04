package fr.ubo.spi.projetAgileSpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjetAgileSpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetAgileSpiApplication.class, args);
	}

}
