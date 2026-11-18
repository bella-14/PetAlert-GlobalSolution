package br.com.petalert.dao;
import br.com.petalert.model.ONG;

public class OngDAO {
      public void cadastrar(ONG Ong) {
        System.out.println("ONG cadastrada no PetAlert");
        System.out.println("A ONG pode divulgar campanhas e apoiar os animais");
    }

    public void consultar(ONG Ong) {
        System.out.println("Consultar informação da Ong");
    }

    public void atualizar(ONG Ong) {
        System.out.println("Atualizar os dados cadastrados da Ong");
    }

    public void excluir(Long id) {
        System.out.println("Solicitação para excluir a ONG");
        System.out.println("Indentificador da ONG" + id);
    }
}

