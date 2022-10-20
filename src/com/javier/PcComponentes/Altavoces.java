package com.javier.PcComponentes;

public class Altavoces {
    /**Atributos*/
    private Integer id;
    private String marca;
    private String modelo;
    private String potencia;

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
    public String getPotencia(){ return potencia; }
    public void setPotencia(String potencia) { this.potencia = potencia; }
    public Float getPrecio(){ return precio; }
    public void setPrecio(Float precio) { this.precio = precio; }
}
