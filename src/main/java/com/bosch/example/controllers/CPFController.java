package com.bosch.example.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.AutoWired;

@RestController
public class CPFController {

    @AutoWired //Detecta que quer um serviço de validaçãod e cpf e busca qual serviço faz isso, o fazendo automaticamente com base nas suas configurações
    CPFValidator validator;


    @GetMapping("/cpf/validate/{cpf}")
    public Boolean validate(@PathVariable String cpf) {
        return validator.validate(cpf);
    }
}
