package com.example.Prueba_Back.controller;
import com.example.Prueba_Back.model.Usuario;
import com.example.Prueba_Back.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistroController {
    @Autowired
    private final UsuarioService usuarioService;

    public RegistroController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@Validated Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "registro";
        }
        usuarioService.registrarUsuario(usuario);
        return "redirect:/login";
    }


}



