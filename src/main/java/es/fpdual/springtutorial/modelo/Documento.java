package es.fpdual.springtutorial.modelo;

import java.util.Date;

public class Documento {

	private Integer id;
	
	private String alias;
	
	private String extension;
	
	private Date fechaCreacion;
	
	private Integer idExpediente;

	public Documento() {
	}

	public Documento(Integer id, String alias, String extension, Date fechaCreacion) {
		super();
		this.id = id;
		this.alias = alias;
		this.extension = extension;
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

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Integer idExpediente) {
		this.idExpediente = idExpediente;
	}
}