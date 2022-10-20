package com.javier.PcComponentes;

public class Raton {
    /**Atributos*/
    private Integer id;
    private String marca;
    private String modelo;
    private String pollingrate;

    private Float precio;
    /**Metodos*/
    public Integer getId(){
        return id;
    }
    public void  setId(Integer id) {
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo(){ return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getPollingrate(){ return pollingrate; }
    public void setPollingrate(String pollingrate) { this.pollingrate = pollingrate; }
    public Float getPrecio(){ return precio; }
    public void setPrecio(Float precio) { this.precio = precio; }

}
