import com.javier.PcComponentes.PlacaBase;
import com.javier.PcComponentes.Procesador;

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

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("17");
        pentium.setFabricante("Intel");
        System.out.println(pentium.getId());
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

        PlacaBase asus = new PlacaBase();
        asus.setId(1);
        asus.setMarca("gmb");
        asus.setFabricante("ASUS");
        asus.setPrecio(29);
        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getPrecio());
    }
}