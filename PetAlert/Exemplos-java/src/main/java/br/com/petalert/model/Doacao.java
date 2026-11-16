package br.com.petalert.model;

public class Doacao {
    private long id;
    private String tipo;
    private String descricao;
    private String status;

public Doacao(){
}

public Doacao (long id,String tipo,String descricao,String status){
    this.id = id;
    this.tipo = tipo;
    this.descricao = descricao;
    this.status = status;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String geTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}