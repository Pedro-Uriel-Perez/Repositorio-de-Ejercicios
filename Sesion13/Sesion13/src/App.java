import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Paso 1: Crear la lista de cadenas llamada listaFrutas y llenarla con los elementos dados
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        // Paso 2: Invertir el orden de los elementos de la colección
        Collections.reverse(listaFrutas);

        // Paso 3: Buscar el elemento más pequeño (primero en orden alfabético)
        String menorElemento = Collections.min(listaFrutas);

        // Paso 4: Buscar el elemento más grande (último en orden alfabético)
        String mayorElemento = Collections.max(listaFrutas);

        // Mostrar resultados
        System.out.println("Lista de frutas invertida: " + listaFrutas);
        System.out.println("Elemento más pequeño (primero en orden alfabético): " + menorElemento);
        System.out.println("Elemento más grande (último en orden alfabético): " + mayorElemento);
    }
}