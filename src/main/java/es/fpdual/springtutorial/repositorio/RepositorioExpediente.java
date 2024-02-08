package es.fpdual.springtutorial.repositorio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Documento;
import es.fpdual.springtutorial.modelo.Expediente;

@Repository
public class RepositorioExpediente {
	
	private final List<Expediente> expedientes = new ArrayList<>();
	
	public List<Expediente> getExpedientes() {
		if (this.expedientes.isEmpty()) {
			this.expedientes.add(new Expediente(1, "EXP", Calendar.getInstance().getTime()));
			this.expedientes.add(new Expediente(2, "EXP2", Calendar.getInstance().getTime()));
			this.expedientes.add(new Expediente(3, "EXP3", Calendar.getInstance().getTime()));
		}
		
		return this.expedientes;
	}
	
	public Integer getSiguienteId() {
		return this.expedientes.isEmpty() ? 1 : this.expedientes.get(this.expedientes.size()-1).getId()+1;
	}
	
	public Expediente getExpedientePorId(Integer id) {
		return this.expedientes.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
	}
	
	public void altaExpediente(Expediente expediente) {
		this.expedientes.add(expediente);
	}
	
	public void editarExpediente(Expediente expediente) {
		Integer indice = this.expedientes.indexOf(this.getExpedientePorId(expediente.getId()));
		
		this.expedientes.set(indice, expediente);
	}
	
	public void eliminarExpediente(Integer id) {
		this.expedientes.remove(this.getExpedientePorId(id));
	}
}
