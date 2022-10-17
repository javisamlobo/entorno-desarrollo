package com.javier.PcComponentes;

public class Torre {
    /**Atributos*/
    private Integer id;
    private String marca;
    private String modelo;
    private String formato;
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
    public String getFormato(){ return formato; }
    public void setFormato(String formato) { this.formato = formato; }
}
