package es.fpdual.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.fpdual.springtutorial.dependencias.ImprimeCadena;

@SpringBootApplication
public class SpringTutorialApplicationDependencias {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringTutorialApplicationDependencias.class, args);
		
		ImprimeCadena ic = ac.getBean(ImprimeCadena.class);

		ic.imprimeCadena("Prueba");
	}

}
