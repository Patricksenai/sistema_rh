package com.rh.sistema_rh.enums;

public enum Salario {
    SUPERVISOR(2000.0),GERENTE(4000.0),ATENDENTE(1000.0);

    private double salarioBase;

    Salario (double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase (){
        return salarioBase;
    }



}
