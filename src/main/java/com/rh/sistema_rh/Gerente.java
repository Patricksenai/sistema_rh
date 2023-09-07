package com.rh.sistema_rh;

import com.rh.sistema_rh.enums.Salario;

public class Gerente extends Funcionario {

    Salario salario = Salario.Gerentesa;


    Salario Gerentesa;
    
    public Gerente( String nome, String cpf, int dataNascimento, String ctps) {
        super( nome, cpf, dataNascimento, ctps);
    }

    @Override
    public double fgts(double salario) {
        return salario * 0.08;
       
      
    }

    @Override
    public double inss(double salario) {
        return salario * 0.01;
    }

    @Override
    public double decimo(double salario) {
        return salario / 12;
    
    }

    @Override
    public double férias(double salario) {
        return salario * 0.08;
   
    }
    
}
