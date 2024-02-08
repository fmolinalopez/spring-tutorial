package es.fpdual.springtutorial.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Usuario;
import es.fpdual.springtutorial.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;

@Service
public class ServicioUsuario {

	private RepositorioUsuario repositorioUsuario;
	
	public ServicioUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}

	public Usuario altaUsuario(Usuario usuario) {
		this.repositorioUsuario.altaUsuario(usuario);
		return usuario;
	}
	
	public List<Usuario> getUsuarios() {
		return this.repositorioUsuario.getUsuarios();
	}
}
