package es.fpdual.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.fpdual.springtutorial.dependencias.ImprimeCadena;
import es.fpdual.springtutorial.dependencias.scope.Prototype;
import es.fpdual.springtutorial.dependencias.scope.Singleton;

@SpringBootApplication
public class SpringTutorialApplicationScope {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringTutorialApplicationScope.class, args);
		
		Singleton singleton = ac.getBean(Singleton.class);
		Singleton singleton2 = ac.getBean(Singleton.class);
		
		System.out.println(singleton);
		System.out.println(singleton.getPrototype());
		System.out.println(singleton2);
		System.out.println(singleton2.getPrototype());
	}

}
