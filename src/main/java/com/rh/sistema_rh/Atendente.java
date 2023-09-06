package com.rh.sistema_rh;

import com.rh.sistema_rh.enums.Salario;

public class Atendente extends Pessoa {

    Salario salario = Salario.Atendentesa;

    public Atendente(int id, String nome, String cpf, int dataNascimento, String ctps) {
        super(id, nome, cpf, dataNascimento, ctps);
    }
    
}
