package br.com.petalert.model;

public class Ocorrencia {
    private long id;
    private String tipo;
    private String data;
    private String status;

public Ocorrencia(){
}

public Ocorrencia (long id,String tipo,String data,String status){
    this.id = id;
    this.tipo = tipo;
    this.data = data;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}