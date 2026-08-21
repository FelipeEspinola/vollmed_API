package br.com.sistema.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Registra a classe OlaController como um controller do SpringBoot
@RequestMapping("ola") // Define a url base para todos os metodos dessa classe
public class OlaController {

    @GetMapping("/olamundo") // Método http do tipo GET
    public String olaMundo(){
        return "Olá Mundo!!!";
    }
}
