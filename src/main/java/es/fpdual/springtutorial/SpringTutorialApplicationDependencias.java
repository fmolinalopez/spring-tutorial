package es.fpdual.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.fpdual.springtutorial.dependencias.ImprimeCadena;

@Configuration
@ComponentScan
public class SpringTutorialApplicationDependencias {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext 
			= new AnnotationConfigApplicationContext(SpringTutorialApplicationDependencias.class)) {
			
			ImprimeCadena ic = applicationContext.getBean(ImprimeCadena.class);
	
			ic.imprimeCadena("Prueba");
		}
	}

}
