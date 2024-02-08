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
import es.fpdual.springtutorial.servicio.ServicioDocumento;

@Controller
public class ControladorDocumento {

	@Autowired
	private ServicioDocumento servicioDocumento;
	
	@GetMapping("/documento")
	public String pantallaAltaDocumento(Model model) {
		
		model.addAttribute("documento", new Documento());
		
		return "documento/altaDocumento";
	}

	@GetMapping("/documento/{id}")
	public String pantallaEditarDocumento(@PathVariable Integer id, Model model) {
		
		Documento documento = this.servicioDocumento.getDocumentoPorId(id);
		
		model.addAttribute("documento", documento);
		
		return "documento/editarDocumento";
	}
	
	@GetMapping("/documentos")
	public String listarDocumentos(Model model) {
		
		List<Documento> documentos = this.servicioDocumento.getDocumentos();
		
		model.addAttribute("documentos", documentos);
		model.addAttribute("documentoABorrar", new Documento());
		
		return "documento/listaDocumentos";
	}
	
	@PostMapping("/documento")
	public String altaDocumento(@ModelAttribute Documento documento,
			Model model) {
		
		this.servicioDocumento.altaDocumento(documento);
		
		return "redirect:/documentos";
	}
	
	@PostMapping("/documento/editar")
	public String editarDocumento(@ModelAttribute Documento documento,
			Model model) {
		this.servicioDocumento.editarDocumento(documento);
		
		return "redirect:/documentos";
	}
	
	@PostMapping("/documento/eliminar")
	public String eliminarDocumento(@ModelAttribute Documento documentoABorrar, Model model) {
		
		this.servicioDocumento.eliminarDocumento(documentoABorrar.getId());
		
		return "redirect:/documentos";
	}
}
