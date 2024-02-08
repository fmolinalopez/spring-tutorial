package es.fpdual.springtutorial.servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpdual.springtutorial.modelo.Documento;
import es.fpdual.springtutorial.repositorio.RepositorioDocumento;

@Service
public class ServicioDocumento {

	@Autowired
	private RepositorioDocumento repositorioDocumento;
	
	public Documento altaDocumento(Documento documento) {
		
		Integer siguienteId = this.repositorioDocumento.getSiguienteId();
		Date fechaCreacion = Calendar.getInstance().getTime();
		
		documento.setId(siguienteId);
		documento.setFechaCreacion(fechaCreacion);
		
		this.repositorioDocumento.altaDocumento(documento);
		
		return documento;
	}
	
	public void editarDocumento(Documento documento) {
		documento.setFechaCreacion(Calendar.getInstance().getTime());
		this.repositorioDocumento.editarDocumento(documento);
	}
	
	public void eliminarDocumento(Integer id) {
		this.repositorioDocumento.eliminarDocumento(id);
	}
	
	public List<Documento> getDocumentos() {
		return this.repositorioDocumento.getDocumentos();
	}
	
	public Documento getDocumentoPorId(Integer id) {
		return this.repositorioDocumento.getDocumentoPorId(id);
	}
	
	public void anadirDocumentoAExpediente(Documento documento, Integer idExpediente) {
		Documento documentoACompletar = this.getDocumentoPorId(documento.getId());
		documentoACompletar.setIdExpediente(idExpediente);
		
		this.editarDocumento(documentoACompletar);
	}
}
