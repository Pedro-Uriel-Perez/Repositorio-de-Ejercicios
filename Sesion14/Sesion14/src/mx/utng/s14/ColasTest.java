package mx.utng.s14;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColasTest {
    public static void main(String[] args) {
        //Crear objeto cola
        Queue<String> cola = new PriorityQueue<>();
        Collections.addAll(cola, "uno", "dos", "tres","cuatro", "cinco");

        for (String cadena : cola) {
            System.out.println(cadena);
            
        }


        System.out.println("------Borrando--------");
        String valor = null;
        while ((valor=cola.poll())!= null) {
            System.out.println(valor);
            
        }
        System.out.println(cola);
        

    
        
    }

    @Override
    public String toString() {
        return "ColasTest []";
    }
    
}
