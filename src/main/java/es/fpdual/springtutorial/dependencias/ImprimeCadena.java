package es.fpdual.springtutorial.dependencias;

import org.springframework.stereotype.Component;

@Component
public class ImprimeCadena {

	public void imprimeCadena(String cadena) {
		
		ServicioCadena servicio = FactoriaServicioCadena.getServicio(cadena.length());
		
		String resultado 
			= servicio.convierteCadena(cadena);
		
		System.out.println(resultado);
	}
}
