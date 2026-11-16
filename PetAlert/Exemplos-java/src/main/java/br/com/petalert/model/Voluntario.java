package br.com.petalert.model;

public class Voluntario extends Usuario {

    public Voluntario(Long id, String nome, String email, String senhaHash) {
        super(id, nome, email, senhaHash);
    }

    @Override
    public String exibirPerfil() {
        return "Voluntario para cuidar de animais";
    }

    @Override
    public String realizarAcao() {
    return "Ajudar na localização de animais e oferecer apoio às campanhas.";
}
}