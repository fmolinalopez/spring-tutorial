package es.fpdual.springtutorial.modelo;

public class Direccion {

	private final Integer id;
	
	private final String domicilio;
	
	private final String localidad;
	
	private final String provincia;
	
	private final Integer codigoPostal;

	public Direccion(Integer id, String domicilio, String localidad, String provincia, Integer codigoPostal) {
		super();
		this.id = id;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}

	public Integer getId() {
		return id;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.id + ", Domicilio: " + this.domicilio
				+ ", Localidad: " + this.localidad + ", Provincia: " + this.provincia
				+ ", CodigoPostal: " + this.codigoPostal;
	}
}
