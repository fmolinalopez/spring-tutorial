package es.fpdual.springtutorial.repositorio;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Cargo;

@Repository
public class RepositorioCargo {

	private final List<Cargo> cargos = Arrays.asList(
					new Cargo(1, "Secretario"),
					new Cargo(2, "Interventor"),
					new Cargo(3, "Alcalde"));
	
	public Cargo getCargoPorId(Integer id) {
		return this.cargos.stream().filter(c -> c.getId().equals(id))
			.findFirst().orElse(null);
	}
}
