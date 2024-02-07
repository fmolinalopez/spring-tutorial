package es.fpdual.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.fpdual.springtutorial.dependencias.lifecycle.LifeCycleBean;

@Configuration
@ComponentScan
public class SpringTutorialApplicationLifeCycle {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(SpringTutorialApplicationLifeCycle.class)) {
		
			LifeCycleBean lc = applicationContext.getBean(LifeCycleBean.class);
					
			System.out.println(lc);
		}
		
	}

}
