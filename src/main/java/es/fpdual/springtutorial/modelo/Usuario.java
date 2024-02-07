package es.fpdual.springtutorial.modelo;

public class Usuario {
	
	private final Integer id;
	
	private final Integer idCargo;
	
	private final Integer idRol;
	
	private final Integer idDireccion;
	
	private final String nombre;
	
	private final String apellido1;
	
	private final String apellido2;

	private Cargo cargo;
	
	private Rol rol;
	
	private Direccion direccion;
	
	public Usuario(Integer id, Integer idCargo, Integer idRol, Integer idDireccion, String nombre, String apellido1,
			String apellido2) {
		this.id = id;
		this.idCargo = idCargo;
		this.idRol = idRol;
		this.idDireccion = idDireccion;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public Integer getId() {
		return id;
	}

	public Integer getIdCargo() {
		return idCargo;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Rol getRol() {
		return rol;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Id: " + this.id 
				+ ", Apellidos: " + this.apellido1 + " " + this.apellido2
				+ ", [Direccion: " + this.direccion + "]"
				+ ", [Cargo: " + this.cargo + "]"
				+ ", [Rol: " + this.rol + "]";
	}
}
