package es.fpdual.springtutorial.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Direccion;

@Repository
public class RepositorioDireccion {
	
	private final List<Direccion> direcciones = Arrays.asList(
			new Direccion(1, "Domicilio 1", "Écija", "Sevilla", 41400),
			new Direccion(2, "Domicilio 2", "Écija", "Sevilla", 41400),
			new Direccion(3, "Domicilio 3", "Madrid", "Madrid", 28018));
	
	public Direccion getDireccionPorId(Integer id) {
		return this.direcciones.stream().filter(d -> d.getId().equals(id))
				.findFirst().orElse(null);
	}
}
