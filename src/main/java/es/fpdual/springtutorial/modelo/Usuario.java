package es.fpdual.springtutorial.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private Integer id;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
}
