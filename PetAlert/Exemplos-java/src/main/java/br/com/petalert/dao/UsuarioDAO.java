package br.com.petalert.dao;
import br.com.petalert.model.Usuario;

public class UsuarioDAO {

    public void cadastrar(Usuario usuario) {
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public void consultar(Usuario usuario) {
        System.out.println("Consultando usuário: " + usuario.getNome());
    }

    public void atualizar(Usuario usuario) {
        System.out.println("Usuário atualizado: " + usuario.getNome());
    }

    public void excluir(Long id) {
        System.out.println("Usuário excluído: " + id);
    }
}
