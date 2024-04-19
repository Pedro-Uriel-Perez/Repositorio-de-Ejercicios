package mx.utng.Sesion04;

public class Letras {

    //  Pedro Uriel Perez Monzon GDS0614

    public static void main(String[] args) {
        Lector lector = new Lector();
        ContadorCaracteres contador = new ContadorCaracteres();
        lector.muestraMensaje("Teclea una palabara: ");
        String palabra = lector.leerEntrada();
        int vocales = contador.cuentaVocales(palabra);
        lector.muestraMensaje("El numero de vocales es: "+ vocales);
        int Consonante = contador.cuentaConsonante(palabra);
        lector.muestraMensaje("El numero de consonantes es: "+ Consonante);
        int Numero = contador.cuentaNumero(palabra);
        lector.muestraMensaje("El numero de numeros es: "+ Numero);
        int Simbolo = contador.cuentaSimbolo(palabra);
        lector.muestraMensaje("El numero de simbolos es: "+ Simbolo);


    }
}

