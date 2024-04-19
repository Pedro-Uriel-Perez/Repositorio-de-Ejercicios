package mx.utng.s06;

import java.util.Scanner;

//  Pedro Uriel Perez Monzon GDS0614


public class ForExample {
    public static void main(String[] args) {
        System.out.println("Ejemplo del ciclo for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        // Tabla del 5
        for (int i = 1; i <= 10; i++) {
            System.out.printf("5*%d=%d%n", i, i * 5);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea numero de la tabla que deces");
        int n = s.nextInt();
        s.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d%n", n, i, n * i);
        }
        String[] frutas = { "Mango", "Pera", "Manzana", "Melon", "Platano" };
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("Usando do while");
        byte i=0;
        while (++i<=10) {
            System.out.println(i);
            
        }
        System.out.println("Usando do while");
        i = 0;
        do {
            System.out.println(++i);   
        } while (i<=10);
    }
}

    
