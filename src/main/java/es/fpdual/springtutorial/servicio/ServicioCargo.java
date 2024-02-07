package es.fpdual.springtutorial.servicio;

import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Cargo;
import es.fpdual.springtutorial.repositorio.RepositorioCargo;

@Service
public class ServicioCargo {

	private RepositorioCargo repositorioCargo;
	
	public ServicioCargo(RepositorioCargo repositorioCargo) {
		this.repositorioCargo = repositorioCargo;
	}

	public Cargo getCargoPorId(Integer id) {
		return this.repositorioCargo.getCargoPorId(id);
	}
}
