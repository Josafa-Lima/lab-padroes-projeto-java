package br.com.josa.designpatterns.app;

import br.com.josa.designpatterns.strategy.*;
import br.com.josa.designpatterns.singleton.ConfiguracaoSistema;
import br.com.josa.designpatterns.facade.*;

public class Main {

    public static void main(String[] args) {

        // STRATEGY
        Robo robo = new Robo("JosaBot");

        robo.setComportamento(new ComportamentoNormal());
        robo.mover();

        robo.setComportamento(new ComportamentoExplorador());
        robo.mover();

        // SINGLETON
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
        System.out.println("Ambiente atual: " + config.getAmbiente());

        // FACADE
        Cliente cliente = new Cliente("Josa", "01001-000");
        CadastroFacade facade = new CadastroFacade();
        facade.cadastrarCliente(cliente);
    }
}
