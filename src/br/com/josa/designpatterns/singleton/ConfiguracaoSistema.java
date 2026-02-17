package br.com.josa.designpatterns.singleton;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;

    private String ambiente;

    private ConfiguracaoSistema() {
        this.ambiente = "DESENVOLVIMENTO";
    }

    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public String getAmbiente() {
        return ambiente;
    }
}
