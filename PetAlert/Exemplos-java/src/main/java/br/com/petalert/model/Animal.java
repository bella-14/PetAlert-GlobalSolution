package br.com.petalert.model;

public class Animal {
    private long id;
    private String nome;
    private String especie;
    private String porte;
    private String descricao;


public Animal(){
}

public Animal (long id,String nome,String especie,String porte,String descricao){
    this.id = id;
    this.nome = nome;
    this.especie = especie;
    this.porte = porte;
    this.descricao = descricao;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}