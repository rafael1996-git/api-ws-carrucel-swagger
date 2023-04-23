package mx.com.talentport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EntityScan("mx.com.talentport")
@ComponentScan("mx.com.talentport")
@EnableAutoConfiguration
public class CarruselApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarruselApplication.class, args);
	}

}
