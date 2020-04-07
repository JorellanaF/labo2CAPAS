package com.example.labo2.controller;

import com.example.labo2.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    String username = "capas";
    String password = "capasP";

    @GetMapping("/login")
    public String enviarform(Usuario usuario){

        return "login";
    }

    @PostMapping("/login")
    public String procesarform(@ModelAttribute(name="usuario") Usuario usuario){

        String userF = usuario.getUsername();
        String passF = usuario.getPassword();

        if(userF.equals(username) && passF.equals(password)){
            return "MostrarmensajeV";
        }else {
            return "MostrarMensajeF";
        }
    }
}
