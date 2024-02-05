package es.fpdual.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringTutorialApplication.class, args);
		
		Prueba prueba = ac.getBean(Prueba.class);
		Prueba prueba2 = ac.getBean(Prueba.class);
		
		System.out.println(prueba);
		System.out.println(prueba2);
	}

}
