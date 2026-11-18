package br.com.petalert.config;

public class ConexaoSingleton {

    private static ConexaoSingleton instancia;

    private ConexaoSingleton() {
    }

    public static ConexaoSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoSingleton();
        }

        return instancia;
    }

    public void iniciarSistema() {
        System.out.println("Sistema PetAlerta iniciado!");
    }
}