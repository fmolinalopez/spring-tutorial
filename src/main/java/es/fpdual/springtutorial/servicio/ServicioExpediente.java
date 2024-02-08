package es.fpdual.springtutorial.servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Documento;
import es.fpdual.springtutorial.modelo.Expediente;
import es.fpdual.springtutorial.repositorio.RepositorioExpediente;

@Service
public class ServicioExpediente {

	@Autowired
	private RepositorioExpediente repositorioExpediente;
	
	public List<Expediente> getExpedientes() {
		return this.repositorioExpediente.getExpedientes();
	}
	
	public Expediente getExpedientePorId(Integer id) {
		return this.repositorioExpediente.getExpedientePorId(id);
	}
	
	public Expediente altaExpediente(Expediente expediente) {
		final Integer siguienteId = this.repositorioExpediente.getSiguienteId();
		final Date fechaCreacion = Calendar.getInstance().getTime();
		
		expediente.setId(siguienteId);
		expediente.setFechaCreacion(fechaCreacion);
		
		this.repositorioExpediente.altaExpediente(expediente);
		
		return expediente;
	}
	
	public void editarExpediente(Expediente expediente) {
		expediente.setFechaCreacion(Calendar.getInstance().getTime());
		this.repositorioExpediente.editarExpediente(expediente);
	}
	
	public void eliminarExpediente(Integer id) {
		this.repositorioExpediente.eliminarExpediente(id);
	}
	
	public void anadirDocumentosAExpediente(Integer idExpediente, List<Documento> documentos) {
		Expediente exp = this.repositorioExpediente.getExpedientePorId(idExpediente);
		exp.setDocumentos(documentos);
		this.repositorioExpediente.editarExpediente(exp);
	}
}
