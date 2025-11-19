package com.example.bibliotecaproyecto.paginas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controladorpaginas {

    @GetMapping("/")  // Ruta raíz de la aplicación
    public String mostrarPrincipal() {
        return "principal"; // Thymeleaf buscará principal.html
    }

    @GetMapping("/iniciologin")
    public String mostrarLogin() {
        return "iniciologin"; // corresponde al archivo iniciologin.html
    }

    @GetMapping("/contactos")
    public String mostrarContactos(){
        return "contactos";
    }

    @GetMapping("/prestamos")
    public String mostrarPrestamos(){
        return "prestamos";
    }

    @GetMapping("/catalogo")
    public String mostrarCatalogo(){
        return "catalogo";
    }

    @GetMapping("/gestionusuario")
    public String mostrarGestionUsuario(){
        return "gestionusuario";
    }

    @GetMapping("/gestionlibros")
    public String mostrarGestionLibros(){
        return "gestionlibros";
    }

    @GetMapping("/gestionprestamos")
    public String mostrarGestionPrestamos(){
        return "gestionprestamos";
    }


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {

        // Ejemplo simple: si el usuario es "admin"
        if (email.equalsIgnoreCase("admin@admin.com") && password.equals("admin")) {
            return "redirect:/gestionusuario";
        }

        // Cualquier otro usuario va a principal
        return "redirect:/principal";
    }


}
