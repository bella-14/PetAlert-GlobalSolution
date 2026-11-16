package br.com.petalert.model;


public class Campanha {
    private long id;
    private String titulo;
    private String descricao;
    private String meta;
    private String status;

public Campanha(){
}

public Campanha(long id,String titulo,String descricao,String meta,String status){
    this.id = id;
    this.titulo = titulo;
    this.descricao = descricao;
    this.meta = meta;
    this.status = status;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta){
        this.meta = meta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}