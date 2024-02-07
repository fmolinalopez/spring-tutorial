package es.fpdual.springtutorial.dependencias;

import org.springframework.stereotype.Component;

@Component
public class ServicioCadenaMinusculas implements ServicioCadena {

	public String convierteCadena(String cadena) {
		return cadena.toLowerCase();
	}
}
