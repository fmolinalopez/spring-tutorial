package es.fpdual.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import es.fpdual.tutorialspring.componentscan.ComponentScanBean;

@SpringBootApplication
@ComponentScan("es.fpdual.tutorialspring")
public class SpringTutorialApplicationComponentScan {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringTutorialApplicationComponentScan.class, args);
		
		ComponentScanBean cs = ac.getBean(ComponentScanBean.class);
		
		System.out.println(cs);
	}

}
