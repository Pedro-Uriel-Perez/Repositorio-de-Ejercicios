import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cadenas = new String[6];
        cadenas[0] = "Zanahoria";
        cadenas[1] = "Cilantro";
        cadenas[2] = "Lechuga";
        cadenas[3] = "Cilantro";
        cadenas[4] = "Coliflor";
        cadenas[5] = "Jicama";

        
        System.out.println(cadenas);



        System.out.println("-----FOREACH---------");

        for (String c : cadenas) {
            System.out.println(c);
        }



        System.out.println("-----FORI---------");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
            
        }

        List<String> verduras = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            verduras.add("Verdura"+ (i+1));
            
        }
        for (String v : verduras) {
            System.out.println(v);
            
        }
        System.out.println("----Cambiar---");

        verduras.set(0,"Zanahoria" );
        verduras.set(1,"Cilantro" );
        verduras.set(2,"Cebolla" );
        verduras.set(3,"Ajo" );
        verduras.remove(4);

        for (int i = 4; i <=  verduras.size(); i++) {
            verduras.remove(1);
            
        }


        
        System.out.println(verduras.get(0));

        for (String v : verduras) {
            System.out.println(v);
            
        }

        Collections.addAll(verduras, "Repollo", "Lechuga", "Coliflor");
        
        
        for (String v : verduras) {
            System.out.println(v);
            
        }
        Collections.reverse(verduras);
        System.out.println(verduras);

        System.out.println("El mas pequeño es "  +Collections.min(verduras));
        System.out.println("El mas grande  es "  +Collections.max(verduras));
        
        Collections.sort(verduras);
        System.out.println(verduras);

        System.out.println("La lechuga es en la posicion "+Collections.binarySearch(verduras, "Lechuga"));
        System.out.println("La Cilantro es en la posicion "+Collections.binarySearch(verduras, "Cilantro"));

        Collections.addAll(verduras, "Lechuga", "lechugas", "Lechuga");
        System.out.println(verduras);

        Collections.shuffle(verduras);
        System.out.println(verduras);

        System.out.println("Hay "+Collections.frequency(verduras, "Lechuga")+" Lechugas");





        


    }
}
