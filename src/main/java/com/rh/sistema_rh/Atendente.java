package com.rh.sistema_rh;

import com.rh.sistema_rh.enums.Salario;

public class Atendente extends Funcionario {


    public Atendente( String nome, String cpf, String  dataNascimento, String ctps) {
        super( nome, cpf, dataNascimento, ctps, Salario.ATENDENTE);
    }


    @Override
    public double csalario() {
        return getTipo().getSalarioBase();
        
    } 
    @Override
    public double tfgts() {
        return csalario() * 0.08;
        
    }

    @Override
    public double tinss() {
        return csalario() * 0.11;
       
    }

    @Override
    public double tdecimo() {
        return csalario()/12;
        
    }

    @Override
    public double tférias() {
        return ((csalario()/12)*0.03)+csalario();
        
    }
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getDataNascimento());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Salário: " + csalario());
        System.out.println("FGTS: " + tfgts());
        System.out.println("Férias: " + tférias());
        System.out.println("INSS: " + tinss());
        System.out.println("Décimo Terceiro: " + tdecimo());  
}
}

