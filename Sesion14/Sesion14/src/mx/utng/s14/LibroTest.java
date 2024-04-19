package mx.utng.s14;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) {
        Queue<Libro> libros = new PriorityQueue<>();
        for (int i = 0; i < args.length; i++) {
            libros.add(new Libro("Libro" + (i + 1), (int) (Math.random() * 10)));
        }
        double random = Math.random();
        System.out.println(random);

        libros.add(new Libro("Libro", (int) (Math.random() * 100)));

        // Imprimir la cola de libros
        System.out.println(libros);

        // Iterar y mostrar los títulos de los libros
        while (!libros.isEmpty()) {
            Libro libro = libros.poll();
            System.out.println(libro.getTITULO());
        }
    }
}