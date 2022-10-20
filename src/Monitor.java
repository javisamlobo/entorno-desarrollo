public class Monitor {
       /**Atributos*/
        private Integer id;
        private String marca;
        private String modelo;
        private String tasa_refresco;
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
        public String getTasa_refresco(){ return tasa_refresco; }
        public void setTasa_refresco(String tasa_refresco) { this.tasa_refresco = tasa_refresco; }
}
