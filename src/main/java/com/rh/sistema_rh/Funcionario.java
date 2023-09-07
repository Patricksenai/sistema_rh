package com.rh.sistema_rh;



import com.rh.sistema_rh.enums.Salario;
import com.rh.sistema_rh.interfaces.Tributos;

abstract class Funcionario extends Pessoa implements Tributos {
    private Salario tipo;

    
    public Funcionario(String nome, String cpf, String dataNascimento, String ctps, Salario tipo) {
        super(nome, cpf, dataNascimento, ctps);
        this.tipo = tipo;
        
    }
    
    
    public Salario getTipo() {
        return tipo;
    }

    public void coletarDados(){

        
    }
  
 }

   

    

