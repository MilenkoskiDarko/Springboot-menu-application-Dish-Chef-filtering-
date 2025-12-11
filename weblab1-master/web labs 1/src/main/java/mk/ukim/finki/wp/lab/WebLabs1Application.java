package mk.ukim.finki.wp.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class WebLabs1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebLabs1Application.class, args);
	}
}
