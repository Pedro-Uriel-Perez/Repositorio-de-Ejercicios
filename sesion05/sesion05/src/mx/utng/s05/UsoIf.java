package mx.utng.s05;

import java.util.Scanner;

    public class UsoIf {
    public static void main(String[] args) {
        String mensaje = " ";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Teclea tu calificacion de POO");
            int nota = scanner.nextInt();

            if (nota == 10) {
                mensaje = "Exelente";
            } else if (nota == 9 || nota == 8) {
                mensaje = "muy bien";
            } else if (nota == 7) {
                mensaje = "Bien hecho";
            } else if (nota == 6) {
                mensaje = "Reprobaste";
            } else if (nota == 5) {
                mensaje = "Mejor vuelve a cursar";
            } else {
                mensaje = "Nota no valida";
            }
        }

        System.out.println(mensaje);
    }
}
    

