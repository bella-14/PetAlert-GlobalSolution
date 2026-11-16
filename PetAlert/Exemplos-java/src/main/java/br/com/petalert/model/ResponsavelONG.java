package br.com.petalert.model;

public class ResponsavelONG extends Usuario {

    public ResponsavelONG(Long id, String nome, String email, String senhaHash) {
        super(id, nome, email, senhaHash);
    }

    @Override
    public String exibirPerfil() {
        return "Responsável por uma ONG.";
    }

    @Override
    public String realizarAcao() {
    return "Gerenciar campanhas e divulgar necessidades da ONG.";
}
}