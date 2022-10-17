package com.javier.PcComponentes;

public class TarjetaSonido {
    /**Atributos*/
    private Integer id;
    private String marca;
    private String modelo;
    private String interfaz;
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
    public String getInterfaz(){ return interfaz; }
    public void setInterfaz(String interfaz) { this.interfaz = interfaz; }

}
