package com.javier.PcComponentes;

public class MemoriaRam {
    /**Atributos*/
    private Integer id;
    private String marca;
    private String modelo;
    private String capacidad;
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
    public String getCapacidad(){ return capacidad; }
    public void setCapacidad(String capacidad) { this.capacidad = capacidad; }

}
