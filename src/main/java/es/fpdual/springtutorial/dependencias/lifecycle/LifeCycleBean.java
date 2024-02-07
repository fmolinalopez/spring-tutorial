package es.fpdual.springtutorial.dependencias.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {

	public LifeCycleBean() {
		System.out.println("Constructor");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("PostConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy");
	}
}
