package com.rh.sistema_rh;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int dataNascimento;
    private String ctps;

    public Pessoa( String nome, String cpf, int dataNascimento,String ctps) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.ctps = ctps;
        
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public String getCtps() {
        return ctps;
    }

    
}
