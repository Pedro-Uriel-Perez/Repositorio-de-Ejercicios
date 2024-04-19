package mx.utng.s06.Reto01;

import java.util.Scanner;

//  Pedro Uriel Perez Monzon GDS0614


public class NumerosPares {
    public static void main(String[] args) {

        //Utilizando el modulo porner todos los numeros pares 
        //que hay en un rango dado por el usuario 
        //inicio, fin, i
        //ciclos for o ciclo white o do while , if
    
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el número de inicio:");
        int inicio = s.nextInt();
        System.out.println("Introduce el número final:");
        int fin = s.nextInt();
        s.close();

        System.out.println("Los números pares son:");
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



    

