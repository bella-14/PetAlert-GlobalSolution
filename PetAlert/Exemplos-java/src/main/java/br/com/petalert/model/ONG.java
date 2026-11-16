package br.com.petalert.model;

public class ONG{
    private long id;
    private String nome;
    private String cnpj;
    private String descricao;
    private String contato;

public ONG(){
}

public ONG (long id,String nome,String cnpj,String descricao,String contato){
    this.id = id;
    this.nome = nome;
    this.cnpj = cnpj;
    this.descricao = descricao;
    this.contato = contato;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getContato(){
        return contato;
    }

    public void setContato(String contato){
        this.contato = contato;
    }
}