package highi.sf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("highi.sf")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*try {
			System.in.read();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	}
	
}
