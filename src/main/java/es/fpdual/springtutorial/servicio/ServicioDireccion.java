package es.fpdual.springtutorial.servicio;

import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Direccion;
import es.fpdual.springtutorial.repositorio.RepositorioDireccion;

@Service
public class ServicioDireccion {

	private RepositorioDireccion repositorioDireccion;
	
	public ServicioDireccion(RepositorioDireccion repositorioDireccion) {
		this.repositorioDireccion = repositorioDireccion;
	}

	public Direccion getDireccionPorId(Integer id) {
		return this.repositorioDireccion.getDireccionPorId(id);
	}
}
