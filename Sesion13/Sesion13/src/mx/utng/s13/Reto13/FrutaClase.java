package mx.utng.s13.Reto13; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** @autor:  Pedro Uriel Perez Monzon
 * @fecha: 9/Feb/2024
 * @grupo: GDS0624
 **/

 
 public class FrutaClase {
     public static void main(String[] args) {

         // Crear una lista de cadenas llamada listaFrutas
         List<String> listaFrutas = new ArrayList<>();
         listaFrutas.add("Plátanos");
         listaFrutas.add("Sandía");
         listaFrutas.add("Pera");
         listaFrutas.add("Manzana");
         listaFrutas.add("Naranja");
         listaFrutas.add("Kiwi");

         System.out.println("Lista de frutas original: "+listaFrutas);
 

         // Invertir el orden de los elementos
         Collections.reverse(listaFrutas);
         System.out.println("Lista de frutas invertida: " + listaFrutas);

 

         // Elemento más pequeño alfabéticamente
         String primerElemento = Collections.min(listaFrutas);
         System.out.println("Primer elemento alfabéticamente: " + primerElemento);


 
         // Elemento más grande último elemento alfabéticamente
         String ultimoElemento = Collections.max(listaFrutas);
         System.out.println("Último elemento alfabéticamente: " + ultimoElemento);



          // Orden de la lista alfabéticamente
        Collections.sort(listaFrutas);
        System.out.println("Lista ordenada alfabéticamente: " + listaFrutas);

 

         // Posición de la Pera y la Naranja
         int posicionPera = listaFrutas.indexOf("Pera");
         int posicionNaranja = listaFrutas.indexOf("Naranja");
         System.out.println("Posición de la Pera es: " + posicionPera);
         System.out.println("Posición de la Naranja es: " + posicionNaranja);


 
         // Tres Manzanas mas a la lista
         listaFrutas.add("Manzana");
         listaFrutas.add("Manzana");
         listaFrutas.add("Manzana");

 
         // Elementos de la lista desordenados
         Collections.shuffle(listaFrutas);
         System.out.println("Lista desordenada: " + listaFrutas);
 
         // Manzanas que hay en la lista
         long cantidadManzanas = listaFrutas.stream().filter(fruta -> fruta.equals("Manzana")).count();
         System.out.println("Cantidad de Manzanas en la lista: " + cantidadManzanas);

 
     }
 }