package cc.cloud.ps.services101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Services101Application {

	public static void main(String[] args) {
		SpringApplication.run(Services101Application.class, args);
	}
	
	@GetMapping("/greeting")
	public String sayHello(){
		return "Hello from Spring boot!";
	}
}
