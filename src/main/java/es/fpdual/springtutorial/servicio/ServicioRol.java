package es.fpdual.springtutorial.servicio;

import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Rol;
import es.fpdual.springtutorial.repositorio.RepositorioRol;

@Service
public class ServicioRol {

	private RepositorioRol repositorioRol;
		
	public ServicioRol(RepositorioRol repositorioRol) {
		this.repositorioRol = repositorioRol;
	}

	public Rol getRolPorId(Integer id) {
		return this.repositorioRol.getRolPorId(id);
	}
}
