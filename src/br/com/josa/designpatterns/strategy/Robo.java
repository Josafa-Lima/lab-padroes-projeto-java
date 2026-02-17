package br.com.josa.designpatterns.strategy;

public class Robo {

    private String nome;
    private Comportamento comportamento;

    public Robo(String nome) {
        this.nome = nome;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        System.out.println("Robô " + nome + " está se movendo...");
        comportamento.mover();
    }
}
