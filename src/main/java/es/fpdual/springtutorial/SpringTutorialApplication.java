package es.fpdual.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.fpdual.springtutorial.modelo.Usuario;
import es.fpdual.springtutorial.servicio.ServicioUsuario;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringTutorialApplication.class, args);
		
		ServicioUsuario servicioUsuario = ac.getBean(ServicioUsuario.class);
		
		Usuario usuario1 = servicioUsuario.getUsuarioPorcodigo(1);
		Usuario usuario2 = servicioUsuario.getUsuarioPorcodigo(2);
		Usuario usuario3 = servicioUsuario.getUsuarioPorcodigo(3);
		
		System.out.println(usuario1);
		System.out.println(usuario2);
		System.out.println(usuario3);
	}
}
