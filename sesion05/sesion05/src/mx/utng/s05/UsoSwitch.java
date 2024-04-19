package mx.utng.s05;

import java.util.Scanner;

//  Pedro Uriel Perez Monzon GDS0614


public class UsoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion de POO");
        int nota = scanner.nextInt();
        scanner.close();

        String mensaje =" ";
        switch (nota) {
            case 10:
                mensaje = "Exelente";
                break;
            case 9:
            case 8:
                mensaje = "muy bien";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Reprobaste";
                break;
            case 5:
                mensaje = "Mejor vuelve a cursar";
                break;

            default:
                mensaje = "Nota no valida";
                break;
        }

        System.out.println(mensaje);



    }
    
}
