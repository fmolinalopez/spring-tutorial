package es.fpdual.springtutorial.dependencias;

import es.fpdual.springtutorial.ProveedorContextoAplicacion;

public class FactoriaServicioCadena {

	public static ServicioCadena getServicio(int longitudCadena) {
		return longitudCadena > 10 ?
				ProveedorContextoAplicacion.getApplicationContext().getBean(ServicioCadenaMayusculas.class)
				: ProveedorContextoAplicacion.getApplicationContext().getBean(ServicioCadenaMinusculas.class);
	}
}
