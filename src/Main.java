import com.javier.PcComponentes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("AMD");
        amd.setModelo("Ryzen 5300");
        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getModelo());

        PlacaBase asus = new PlacaBase();
        asus.setId(1);
        asus.setMarca("Asus");
        asus.setModelo("blackrock");
        asus.setPrecio(29.54f);
        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getModelo());
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

        MemoriaRAM kingston = new MemoriaRAM();
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

        FuenteAlimentacion corsair = new FuenteAlimentacion();
        corsair.setId(1);
        corsair.setMarca("Corsair");
        corsair.setModelo("CV");
        corsair.setPotencia(850);
        System.out.println(corsair.getId());
        System.out.println(corsair.getMarca());
        System.out.println(corsair.getModelo());
        System.out.println(corsair.getPotencia());

        TarjetaSonido creative = new TarjetaSonido();
        creative.setId(1);
        creative.setMarca("Creative");
        creative.setModelo("Sound Blaster");
        creative.setInterfaz("USB");
        System.out.println(creative.getId());
        System.out.println(creative.getMarca());
        System.out.println(creative.getModelo());
        System.out.println(creative.getInterfaz());

        VentiladorCPU noctua = new VentiladorCPU();
        noctua.setId(1);
        noctua.setMarca("Noctua");
        noctua.setModelo("NH-U125");
        noctua.setChipset("LGA1200");
        System.out.println(noctua.getId());
        System.out.println(noctua.getMarca());
        System.out.println(noctua.getModelo());
        System.out.println(noctua.getChipset());

        GrabadoraDVD lg = new GrabadoraDVD();
        lg.setId(1);
        lg.setMarca("LG");
        lg.setModelo("Ultra Slim");
        lg.setPrecio(56.45f);
        System.out.println(lg.getId());
        System.out.println(lg.getMarca());
        System.out.println(lg.getModelo());
        System.out.println(lg.getPrecio());

        Monitor msi = new Monitor();
        msi.setId(1);
        msi.setMarca("MSI");
        msi.setModelo("G241VC");
        msi.setTasa_refresco("75Hz");
        System.out.println(msi.getId());
        System.out.println(msi.getMarca());
        System.out.println(msi.getModelo());
        System.out.println(msi.getTasa_refresco());

        Teclado razer = new Teclado();
        razer.setId(1);
        razer.setMarca("LG");
        razer.setModelo("Ultra Slim");
        razer.setPrecio(156.95f);
        System.out.println(razer.getId());
        System.out.println(razer.getMarca());
        System.out.println(razer.getModelo());
        System.out.println(razer.getPrecio());

        Raton logitech = new Raton();
        logitech.setId(1);
        logitech.setMarca("Logitech");
        logitech.setModelo("G502");
        logitech.setPollingrate("16.000 DPI");
        logitech.setPrecio(98.95f);
        System.out.println(logitech.getId());
        System.out.println(logitech.getMarca());
        System.out.println(logitech.getModelo());
        System.out.println(logitech.getPollingrate());
        System.out.println(logitech.getPrecio());

        Altavoces newskill = new Altavoces();
        newskill.setId(1);
        newskill.setMarca("Newskill");
        newskill.setModelo("Vamana RGB");
        newskill.setPotencia("10 W");
        newskill.setPrecio(56.23f);
        System.out.println(newskill.getId());
        System.out.println(newskill.getMarca());
        System.out.println(newskill.getModelo());
        System.out.println(newskill.getPotencia());
        System.out.println(newskill.getPrecio());

    }

}