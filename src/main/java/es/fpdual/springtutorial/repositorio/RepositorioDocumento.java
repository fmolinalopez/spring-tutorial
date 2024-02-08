package es.fpdual.springtutorial.repositorio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springtutorial.modelo.Documento;

@Repository
public class RepositorioDocumento {

	private final List<Documento> documentos = new ArrayList<>();
	
	public List<Documento> getDocumentos() {
		if (documentos.isEmpty()) {
			documentos.add(new Documento(1, "Factura", "DOCX", Calendar.getInstance().getTime()));
			documentos.add(new Documento(2, "Dictamen", "PDF", Calendar.getInstance().getTime()));
			documentos.add(new Documento(3, "Propuesta", "RTF", Calendar.getInstance().getTime()));
		}
		
		return this.documentos;
	}

	public Documento getDocumentoPorId(Integer id) {
		return documentos.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
	}
	
	public void altaDocumento(Documento documento) {
		this.documentos.add(documento);
	}
	
	public void editarDocumento(Documento documento) {
		Integer indice = this.documentos.indexOf(this.getDocumentoPorId(documento.getId()));
		
		this.documentos.set(indice, documento);
	}
	
	public void eliminarDocumento(Integer id) {
		this.documentos.remove(this.getDocumentoPorId(id));
	}
	
	public Integer getSiguienteId() {
		return documentos.isEmpty() ? 1 : documentos.get(documentos.size()-1).getId()+1;
	}
}
