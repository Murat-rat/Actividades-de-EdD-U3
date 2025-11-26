//import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        //Map<Integer, String> map = new HashMap<>();
        //Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Mouse");
        map.put(2, "Teclado");
        map.put(3, "Botoncito");
        map.put(0, "USB");
        map.put(1, "Mouse Gamer");
        map.put(10, "Test");

        System.out.println(map);
        String value = map.get(10);
        System.out.println(value);

        boolean exists = map.containsKey(10);
        System.out.println("¿Existe la key 10? " + exists);

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("La key es: " + entry.getKey() + " y el valor es: " + entry.getValue());
        }

        int size = map.size();
        System.out.println("El tamaño del map es: " + size);
    }
}