package com.rh.sistema_rh.interfaces;

public interface Tributos {
    double fgts(double salario);
    double inss(double salario);
    double decimo(double salario);
    double férias(double salario);


    
}
