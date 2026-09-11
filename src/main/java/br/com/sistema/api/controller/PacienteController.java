package br.com.sistema.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.api.model.medico.Medico;
import br.com.sistema.api.model.paciente.Paciente;
import br.com.sistema.api.model.paciente.PacienteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("paciente") 
public class PacienteController { 
    //GET Request -> Response -> EX: Tela home

    @Autowired 
    private PacienteRepository pacienteRepository;

    @GetMapping("/") //Aponta para Localhost:8080/paciente
    public List<Paciente> listarPacientes(){
        return pacienteRepository.findAll();
    }
    }
    

    //GET/POST Request -> Response -> Ex: Cadastrar Paciente. Exibe tela de cadastro e o POST é chamado quando o enviar é clicado.
    //GET/PUT Request -> Response -> Ex: Alterar telefone. Get exibe a tela de alteração e o PUT é chamado quando o botão alterar é clicado.
    
    //DELETE
    
    // CRUD 



