package es.fpdual.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.fpdual.springtutorial.dependencias.lifecycle.LifeCycleBean;

@SpringBootApplication
public class SpringTutorialApplicationLifeCycle {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringTutorialApplicationLifeCycle.class, args);
		
		LifeCycleBean lc = ac.getBean(LifeCycleBean.class);
		
		System.out.println(lc);
	}

}
