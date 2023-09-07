package com.rh.sistema_rh;

import com.rh.sistema_rh.enums.Salario;

public class Atendente extends Funcionario {

    Salario salario = Salario.Atendentesa;

    public Atendente( String nome, String cpf, int dataNascimento, String ctps) {
        super( nome, cpf, dataNascimento, ctps);
    }

    @Override
    public double fgts(double salario) {
        return salario * 0.08;
        
    }

    @Override
    public double inss(double salario) {
        return salario * 0.1;
       
    }

    @Override
    public double decimo(double salario) {
        return salario/12;
        
    }

    @Override
    public double férias(double salario) {
        return salario * 0.08;
        
    }
    
}
