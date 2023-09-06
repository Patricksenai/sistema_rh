package com.rh.sistema_rh.enums;

public enum Salario {
    Supervisorsa(2.000),Gerentesa(4.000),Atendentesa(1.500);

    private double valor;

    Salario (double valor){
        this.valor = valor;
    }

    public double getValor (){
        return valor;
    }



}
