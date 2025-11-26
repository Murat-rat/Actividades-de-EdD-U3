//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        //Set<String> set = new HashSet<>();
        //Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("Verde");
        set.add("Rojo");
        set.add("Azul");
        set.add("Verde"); //Ignora duplicados

        System.out.println(set);

        boolean existeVerde = set.contains("Verde");
        set.remove("Azul");
        int tam = set.size();

        for(String data : set) { //Recorrido manual, puede ser con fori o con Iterator
            System.out.println("Dato en row: " + data);
        }

        System.out.println("Existe Verde? " + existeVerde);
        System.out.println("El tamaño final es de: " + tam);
    }
}