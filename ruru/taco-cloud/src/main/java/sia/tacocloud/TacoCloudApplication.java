package sia.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//spring boot application
//combine by @SpringBootconfiguration, @EnableAutoConfiguration and @ComponentScan
@SpringBootApplication
public class TacoCloudApplication {

//runs the application
	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
