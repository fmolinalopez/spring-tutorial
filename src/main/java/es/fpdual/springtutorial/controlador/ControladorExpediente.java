package es.fpdual.springtutorial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import es.fpdual.springtutorial.modelo.Documento;
import es.fpdual.springtutorial.modelo.Expediente;
import es.fpdual.springtutorial.servicio.ServicioDocumento;
import es.fpdual.springtutorial.servicio.ServicioExpediente;

@Controller
public class ControladorExpediente {

	@Autowired
	private ServicioExpediente servicioExpediente;
	
	@Autowired
	private ServicioDocumento servicioDocumento;
	
	@GetMapping("/expediente")
	public String pantallaAltaExpediente(Model model) {
		model.addAttribute("expediente", new Expediente());
		
		return "expediente/altaExpediente";
	}
	
	@GetMapping("/expedientes")
	public String pantallaListaExpedientes(Model model) {
		
		final List<Expediente> expedientes = this.servicioExpediente.getExpedientes();
		
		model.addAttribute("expedientes", expedientes);
		model.addAttribute("expedienteABorrar", new Expediente());
		
		return "expediente/listaExpedientes";
	}
	
	@GetMapping("/expediente/{id}")
	public String pantallaEditarDocumento(@PathVariable Integer id, Model model) {
		
		Expediente expediente = this.servicioExpediente.getExpedientePorId(id);
		
		model.addAttribute("expediente", expediente);
		
		return "expediente/editarExpediente";
	}
	
	@GetMapping("/expediente/anadir/{id}")
	public String pantallaAnadirDocumentosAExpediente(@PathVariable Integer id, Model model) {
		
		Expediente expediente = this.servicioExpediente.getExpedientePorId(id);
		List<Documento> documentos = this.servicioDocumento.getDocumentos();
		
		return "";
	}
	
	@PostMapping("/expediente")
	public String altaExpediente(@ModelAttribute Expediente expediente, Model model) {
		
		this.servicioExpediente.altaExpediente(expediente);
		
		return "redirect:/expedientes";
	}
	
	@PostMapping("/expediente/editar")
	public String editarExpediente(@ModelAttribute Expediente expediente, Model model) {
		
		this.servicioExpediente.editarExpediente(expediente);
		
		return "redirect:/expedientes";
	}
	
	@PostMapping("/expediente/eliminar")
	public String eliminarExpediente(@ModelAttribute Expediente expediente, Model model) {
		
		this.servicioExpediente.eliminarExpediente(expediente.getId());
		
		return "redirect:/expedientes";
	}
}
