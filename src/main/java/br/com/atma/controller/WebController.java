package br.com.atma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index"; // Nome do arquivo sem a extensão .html
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Nome do arquivo sem a extensão .html
    }

    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }

    @GetMapping("/detalhes")
    public String detalhes() {
        return "detalhes";
    }

    @GetMapping("/produtos")
    public String produtos() {
        return "produtos";
    }

    @GetMapping("/adm")
    public String adm() {
        return "adm";
    }

    @GetMapping("/logout")
    public String logout() {
        return "index";
    }

    @GetMapping("/carrinho")
    public String carrinho() {
        return "carrinho";
    }
}