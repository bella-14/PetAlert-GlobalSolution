package br.com.petalert.model;

public class Localizacao {
    private long id;
    private String cidade;
    private String estado;
    private String bairro;
    private double latitude;
    private double longitude;


public Localizacao(){
}

public Localizacao (long id,String cidade,String estado,String bairro,double latitude, double longitude){
    this.id = id;
    this.cidade = cidade;
    this.estado = estado;
    this.bairro = bairro;
    this.latitude = latitude;
    this.longitude = longitude;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLongitude(){
        return longitude;
    }
    
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
}