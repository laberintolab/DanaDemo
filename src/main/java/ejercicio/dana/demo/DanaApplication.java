package ejercicio.dana.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {"ejercicio.dana.demo"})
public class DanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanaApplication.class, args);
	}

}
