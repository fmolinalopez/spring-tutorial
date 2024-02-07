package es.fpdual.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.fpdual.springtutorial.dependencias.scope.Singleton;

@Configuration
@ComponentScan
public class SpringTutorialApplicationScope {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(SpringTutorialApplicationScope.class)) {
		
			Singleton singleton = applicationContext.getBean(Singleton.class);
			Singleton singleton2 = applicationContext.getBean(Singleton.class);
			
			System.out.println(singleton);
			System.out.println(singleton.getPrototype());
			System.out.println(singleton2);
			System.out.println(singleton2.getPrototype());
		}
	}

}
