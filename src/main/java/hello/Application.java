package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String index() {
		return "Hello Docker World";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "Hello Docker World, From Home";
	}
	
	@RequestMapping("/pages")
	public String pages() {
		return "Hello Docker World, pages";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
