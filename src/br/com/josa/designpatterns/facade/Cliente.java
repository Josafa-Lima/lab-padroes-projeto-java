package br.com.josa.designpatterns.facade;

public class Cliente {

    private String nome;
    private String cep;

    public Cliente(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getCep() {
        return cep;
    }
}
