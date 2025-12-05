package JavaColecciones;

import java.util.HashMap;
import java.util.Map;

public class Hast_Map {
    public static void ejer(){
        Map<String, Double> inventario = new HashMap();

        inventario.put("Manzana", 1.4);
        inventario.put("Pera", 1.2);
        inventario.put("Uva", 1.6);
        inventario.put("Banano", 1.8);

        System.out.println("Mostrando todo el inventario");
        for (String fruta:inventario.keySet()){
            System.out.println(fruta + ": $"+ inventario.get(fruta));
        }
    }
}
