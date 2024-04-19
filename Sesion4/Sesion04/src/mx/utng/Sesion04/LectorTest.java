package mx.utng.Sesion04;

public class LectorTest {
    public static void main(String[] args) {
        Lector lector = new Lector();

        lector.muestraMensaje("Teclea tu nombre: ");
        String nombre = lector.leerEntrada();

    lector.muestraMensaje("hola "+nombre);


    }
}
