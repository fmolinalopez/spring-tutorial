package es.fpdual.springtutorial.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Rol;

@Repository
public class RepositorioRol {
	
	private final List<Rol> roles = Arrays.asList(
			new Rol(1, "Admin"),
			new Rol(2, "Escritura"),
			new Rol(3, "SoloLectura"));
	
	public Rol getRolPorId(Integer id) {
		return this.roles.stream().filter(r -> r.getId().equals(id))
				.findFirst().orElse(null);
	}
}
