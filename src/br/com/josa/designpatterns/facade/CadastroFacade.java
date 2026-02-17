package br.com.josa.designpatterns.facade;

public class CadastroFacade {

    public void cadastrarCliente(Cliente cliente) {

        System.out.println("Buscando dados do CEP...");
        String cidade = "São Paulo";
        String estado = "SP";

        System.out.println("Gravando cliente no sistema...");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
