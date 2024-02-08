package es.fpdual.springtutorial.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Usuario;
import lombok.Getter;

@Repository
public class RepositorioUsuario {

	private final List<Usuario> usuarios = new ArrayList<>();
	
	public void altaUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public Integer getSiguienteId() {
		return usuarios.isEmpty() ? 1 : usuarios.get(usuarios.size()-1).getId()+1;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
