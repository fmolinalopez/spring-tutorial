package es.fpdual.springtutorial.dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImprimeCadena {

	@Autowired
	private ServicioCadena servicioCadenaMinusculas;
	
	public ImprimeCadena(ServicioCadena servicioCadenaMinusculas) {
		this.servicioCadenaMinusculas = servicioCadenaMinusculas;
	}

	public void imprimeCadena(String cadena) {
		
		String resultado 
			= this.servicioCadenaMinusculas.convierteCadena(cadena);
		
		System.out.println(resultado);
	}
}
