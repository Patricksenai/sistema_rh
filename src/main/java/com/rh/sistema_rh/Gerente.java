package com.rh.sistema_rh;

import com.rh.sistema_rh.enums.Salario;

public class Gerente extends Pessoa {

    Salario Gerentesa;
    
    public Gerente(int id, String nome, String cpf, int dataNascimento, String ctps) {
        super(id, nome, cpf, dataNascimento, ctps);
    }
    
}
