package tp.publicTransport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PublicTransportApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicTransportApplication.class, args);
	}

}