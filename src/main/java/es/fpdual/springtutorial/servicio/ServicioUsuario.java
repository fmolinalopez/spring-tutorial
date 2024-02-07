package es.fpdual.springtutorial.servicio;

import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Cargo;
import es.fpdual.springtutorial.modelo.Direccion;
import es.fpdual.springtutorial.modelo.Rol;
import es.fpdual.springtutorial.modelo.Usuario;
import es.fpdual.springtutorial.repositorio.RepositorioUsuario;

@Service
public class ServicioUsuario {

	private ServicioCargo servicioCargo;
	
	private ServicioRol servicioRol;
	
	private ServicioDireccion servicioDireccion;
	
	private RepositorioUsuario repositorioUsuario;

	public ServicioUsuario(ServicioCargo servicioCargo, ServicioRol servicioRol, ServicioDireccion servicioDireccion,
			RepositorioUsuario repositorioUsuario) {
		this.servicioCargo = servicioCargo;
		this.servicioRol = servicioRol;
		this.servicioDireccion = servicioDireccion;
		this.repositorioUsuario = repositorioUsuario;
	}

	public Usuario getUsuarioPorcodigo(Integer id) {
		Usuario usuario = this.repositorioUsuario.getUsuarioPorId(id);
		
		this.completarUsuario(usuario);
		
		return usuario;
	}
	
	private void completarUsuario(Usuario usuario) {
		Cargo cargo = this.servicioCargo.getCargoPorId(usuario.getIdCargo());
		Rol rol = this.servicioRol.getRolPorId(usuario.getIdRol());
		Direccion direccion = this.servicioDireccion.getDireccionPorId(usuario.getIdDireccion());
		
		usuario.setCargo(cargo);
		usuario.setRol(rol);
		usuario.setDireccion(direccion);
	}
}
