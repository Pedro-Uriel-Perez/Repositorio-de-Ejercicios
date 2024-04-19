package mx.utng.Sesion04;

import java.util.Scanner;

public class Lector {
    
    private Scanner scanner;


    public Lector (){
        scanner = new Scanner(System.in);
    }

    public void muestraMensaje(String mensaje) {
        System.out.println(mensaje);

    }
    public String leerEntrada(){
        return scanner.nextLine();
    }

}
