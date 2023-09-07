package com.rh.sistema_rh;

abstract class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String ctps;


public Pessoa( String nome, String cpf, String dataNascimento,String ctps) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.ctps = ctps;
}
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCtps() {
        return ctps;
    }

    public abstract void imprimirDados();

    
}
