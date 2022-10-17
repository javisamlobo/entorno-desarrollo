package com.javier.PcComponentes;

public class FuenteAlimentacion {
    /**Atributos*/
    private Integer id;
    private String marca;
    private String modelo;
    private Integer potencia;
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
    public Integer getPotencia(){ return potencia; }
    public void setPotencia(Integer potencia) { this.potencia = potencia; }
}
