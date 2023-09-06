package com.rh.sistema_rh;



public abstract class Pessoa {
    int id;
    String nome;
    String cpf;
    int dataNascimento;
    String ctps;
    


    public Pessoa(int id, String nome, String cpf, int dataNascimento, String ctps) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.ctps = ctps;

    }


}
