package mx.utng.Tarea1;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
                                                                            //  Pedro Uriel Perez Monzon GDS0614 
        while (!salir) {
            System.out.println("Selecciona que deceas realizar:");
            System.out.println("1 - Crear nueva lista de tareas");
            System.out.println("2 - Ver lista de tareas");
            System.out.println("3 - Ver tarea de lista");
            System.out.println("4 - Actualizar lista de tareas");
            System.out.println("5 - Eliminar lista de tareas");
            System.out.println("6 - Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Aquí va el código para crear una nueva lista de tareas
                    System.out.println("Has seleccionado: Crear nueva lista de tareas");
                    break;
                case 2:
                    // Aquí va el código para ver la lista de tareas
                    System.out.println("Has seleccionado: Ver lista de tareas");
                    break;
                case 3:
                    // Aquí va el código para ver una tarea de la lista
                    System.out.println("Has seleccionado: Ver tarea de lista");
                    break;
                case 4:
                    // Aquí va el código para actualizar la lista de tareas
                    System.out.println("Has seleccionado: Actualizar lista de tareas");
                    break;
                case 5:
                    // Aquí va el código para eliminar la lista de tareas
                    System.out.println("Has seleccionado: Eliminar lista de tareas");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor, selecciona una opción válida (1-6)");
            }
        }

        scanner.close();
        System.out.println("Gracias por utilizar la aplicación. ¡Hasta luego!");
    }
}