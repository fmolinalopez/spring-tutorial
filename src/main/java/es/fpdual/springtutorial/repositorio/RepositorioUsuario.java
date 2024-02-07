package es.fpdual.springtutorial.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Usuario;
import lombok.Getter;

@Repository
public class RepositorioUsuario {

	@Getter
	private List<Usuario> usuarios = new ArrayList<>();
	
	public void altaUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
}
