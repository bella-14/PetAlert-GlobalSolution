package br.com.petalert.model;

public class Protetor extends Usuario {

    public Protetor(long id, String nome,String email, String senhaHash){
        super(id, nome, email, senhaHash);
    }
    @Override 
    public String exibirPerfil(){
        return "Protetor de animais";
    }
    @Override
    public String realizarAcao() {
    return "Cadastrar animal e publicar ocorrência de desaparecimento.";
}

}
