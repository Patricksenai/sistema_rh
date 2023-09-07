package com.rh.sistema_rh;

import com.rh.sistema_rh.interfaces.Tributos;

public abstract class Funcionario extends Pessoa implements Tributos {

    public Funcionario(String nome, String cpf, int dataNascimento, String ctps) {
        super(nome, cpf, dataNascimento, ctps);
      
    }

    
  
    }

   

    

