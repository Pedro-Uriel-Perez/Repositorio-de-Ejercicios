import mx.utng.s07.Lector;
import mx.utng.s07.ListaTareas;
import mx.utng.s07.Menu;

//  Pedro Uriel Perez Monzon GDS0614

public class App {
    public static void main(String[] args) throws Exception {
        //crea onjetos nesesarios 
        Menu menu =new Menu();
        Lector lector = new Lector();
        ListaTareas Lista = new ListaTareas();

        byte opcionSeleccionada = 0;
        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leerOpcion();
            System.out.printf("%n%nLa Opcion seleccionada fue: %d%n", opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    Lista.crearNuevaLista();
                    break;
                case 2:
                    Lista.verListaDeTareas();
                    break;
                case 3:
                    Lista.verTareaLista();
                    break;
                case 4:
                    Lista.actualizarListaDeTareas();
                    break;
                case 5:
                    Lista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicacion adios ");

                    break;
            
                default:
                    System.out.println("Operacion cesconocida");
                    break;
            }



        } while (opcionSeleccionada !=6);


    }
}
