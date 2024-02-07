package es.fpdual.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.fpdual.tutorialspring.componentscan.ComponentScanBean;

@Configuration
@ComponentScan("es.fpdual.tutorialspring")
public class SpringTutorialApplicationComponentScan {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(SpringTutorialApplicationComponentScan.class)) {
//			ComponentScanBean cs = applicationContext.getBean(ComponentScanBean.class);
			ComponentScanBean cs = ProveedorContextoAplicacion.getApplicationContext().getBean(ComponentScanBean.class);
			
			System.out.println(cs);
		}
		
	}

}
