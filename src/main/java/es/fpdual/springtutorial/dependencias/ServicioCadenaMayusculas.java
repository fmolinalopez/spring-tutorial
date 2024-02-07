package es.fpdual.springtutorial.dependencias;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ServicioCadenaMayusculas implements ServicioCadena {

	public String convierteCadena(String cadena) {
		return cadena.toUpperCase();
	}
}
