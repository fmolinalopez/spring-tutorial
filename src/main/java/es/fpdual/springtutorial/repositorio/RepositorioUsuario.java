package es.fpdual.springtutorial.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Usuario;

@Repository
public class RepositorioUsuario {

	private final List<Usuario> usuarios = Arrays.asList(
			new Usuario(1, 3, 1, 2, "Fran", "Molina", "Lopez"),
			new Usuario(2, 2, 2, 1, "UPrueba", "Ape1", "Ape2"),
			new Usuario(3, 1, 3, 3, "UP2", "UPApe1", "UPApe2"));
	
	public Usuario getUsuarioPorId(Integer id) {
		return usuarios.stream().filter(u -> u.getId().equals(id))
				.findFirst().orElse(null);
	}
}
