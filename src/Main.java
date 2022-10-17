import com.javier.PcComponentes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Ryzen");
        amd.setFabricante("AMD");
        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        PlacaBase asus = new PlacaBase();
        asus.setId(1);
        asus.setMarca("gmb");
        asus.setFabricante("ASUS");
        asus.setPrecio(29);
        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getPrecio());

        TarjetaGrafica nvidia = new TarjetaGrafica();
        nvidia.setId(1);
        nvidia.setMarca("Nvidia");
        nvidia.setModelo("3090");
        nvidia.setMemoria("8GB");
        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getModelo());
        System.out.println(nvidia.getMemoria());

        MemoriaRam kingston = new MemoriaRam();
        kingston.setId(1);
        kingston.setMarca("Kingston");
        kingston.setModelo("Fury Beast");
        kingston.setCapacidad("16GB");
        System.out.println(kingston.getId());
        System.out.println(kingston.getMarca());
        System.out.println(kingston.getModelo());
        System.out.println(kingston.getCapacidad());

        Torre tempest = new Torre();
        tempest.setId(1);
        tempest.setMarca("Tempest");
        tempest.setModelo("Spectra");
        tempest.setFormato("ATx");
        System.out.println(tempest.getId());
        System.out.println(tempest.getMarca());
        System.out.println(tempest.getModelo());
        System.out.println(tempest.getFormato());

        DiscoDuro samsung = new DiscoDuro();
        samsung.setId(1);
        samsung.setMarca("Samsung");
        samsung.setModelo("870 QV");
        samsung.setFormato("SATA");
        System.out.println(samsung.getId());
        System.out.println(samsung.getMarca());
        System.out.println(samsung.getModelo());
        System.out.println(samsung.getFormato());
    }
}