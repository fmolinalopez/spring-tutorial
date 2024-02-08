package es.fpdual.springtutorial.controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fpdual.springtutorial.modelo.Usuario;
import es.fpdual.springtutorial.servicio.ServicioUsuario;
import sun.print.resources.serviceui;

@Controller
public class ControladorUsuario {
	
	private ServicioUsuario servicioUsuario;
	
	public ControladorUsuario(ServicioUsuario servicioUsuario) {
		this.servicioUsuario = servicioUsuario;
	}

	@GetMapping("/usuario")
	public String pantallaAltaUsario(Model model) {
		model.addAttribute("usuario", new Usuario());
		
		return "altaUsuario";
	}
	
	@GetMapping("/usuarios")
	public String listarUsuarios(Model model) {
		
		List<Usuario> usuarios = this.servicioUsuario.getUsuarios();
		
		model.addAttribute("usuarios", usuarios);
		
		return "listaUsuarios";
	}
	
	@PostMapping("/usuario")
	public String altaUsuario(@ModelAttribute Usuario usuario,
			Model model) {
		
		this.servicioUsuario.altaUsuario(usuario);
		
		return "redirect:/usuarios";
	}
}
