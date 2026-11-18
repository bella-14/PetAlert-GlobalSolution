package br.com.petalert.dao;
import java.time.LocalDate;

import br.com.petalert.model.Ocorrencia;

public class OcorrenciaDAO {

    public void cadastrar(Ocorrencia ocorrencia) {
        System.out.println("Ocorrência cadastrada com sucesso");
    }

    public void consultar(Ocorrencia ocorrencia) {
        System.out.println("Consultando ocorrência");
    }

    public void atualizar(Ocorrencia ocorrencia) {
        LocalDate dataAtualizada = LocalDate.now();
        System.out.println("Atualizar ocorrência do dia" + dataAtualizada);
    }

    public void excluir(Long id) {
        System.out.println("Ocorrência excluída: " + id);
    }
}