package es.fpdual.springtutorial.modelo;

public class Rol {

private final Integer id;
	
	private final String descripcion;

	public Rol(Integer id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.id + ", Descripcion: " + this.descripcion;
	}
}
