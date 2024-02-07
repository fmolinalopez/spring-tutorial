package es.fpdual.springtutorial.dependencias.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Singleton {

	@Autowired
	private Prototype prototype;

	public Singleton(Prototype prototype) {
		super();
		this.prototype = prototype;
	}

	public Prototype getPrototype() {
		return prototype;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}
}
