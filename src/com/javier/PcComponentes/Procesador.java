package com.javier.PcComponentes;

/**
 * Clase Procesador
 */
public class Procesador {
    /**
     * Atributos, propiedades, variables
     */
    private Integer id;
    private String marca;
    private String modelo;

    /**
     * Metodos, funciones, comportamiento
     */
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

}