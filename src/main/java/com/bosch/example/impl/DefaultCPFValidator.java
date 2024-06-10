package com.bosch.examples.impl;

import com.bosch.example.services.CPFValidator;

public class DefaultCPFValidator implements CPDValidator{

    public Boolean validate(Spring cpf){

        System.out.println("Validei um cepa tlg");
        return true;
    }

}
