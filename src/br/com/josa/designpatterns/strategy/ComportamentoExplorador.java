package br.com.josa.designpatterns.strategy;

public class ComportamentoExplorador implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Explorando o ambiente de forma estratégica...");
    }
}
