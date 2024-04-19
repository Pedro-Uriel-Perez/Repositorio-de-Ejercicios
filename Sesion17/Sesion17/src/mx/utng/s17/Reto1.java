
package mx.utng.s17;
import java.io.File;

public class Reto1 {
    public static void main(String[] args) {
        File directorioInicial = new File("ruta de team en escritorio");

        muestraDirectorio(directorioInicial);
        
    }
    
    private static void muestraDirectorio(File directorio) {
        



        //Poner la marca de inicio y el nombre del primer directorio
        colocaEspacios(directorio.getParent(), "D");
        System.out.println(directorio.getName());

        //Crear un arreglo de subdirectorios
        File[] subdirectorios = directorio.listFiles();

        //Recorrer la lista de archivos y verificamos que sean A o D

        for (File archivo : subdirectorios) {
            //verificar si es archivo
            if (archivo.isFile()) {

                colocaEspacios(archivo.getParent(), "A");
                System.out.println(archivo.getName());

            }else if (archivo.isDirectory()) {
                muestraDirectorio(archivo);
            }
           
            
        }



    }

    private static void colocaEspacios(String padre, char simbolo){
        //colocar la marca de inicio de linea[A]- archivo  [D]-directorio

        System.out.print("["+simbolo+"]");

        //Colocar serie de guines de acuerdo a la profundidad del directorio

        for (int i = 0; i < padre.length(); i++) {
            System.out.print("-");
            
        }

        


    }

}
