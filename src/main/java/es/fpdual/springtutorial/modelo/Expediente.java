package es.fpdual.springtutorial.modelo;

import java.util.Date;
import java.util.List;

public class Expediente {

	private Integer id;
	
	private String alias;
	
	private Date fechaCreacion;
	
	List<Documento> documentos;

	public Expediente() {
	}

	public Expediente(Integer id, String alias, Date fechaCreacion) {
		this.id = id;
		this.alias = alias;
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
}
