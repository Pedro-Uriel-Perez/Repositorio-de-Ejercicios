package mx.utng.s17;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        int resultado;
        double lado1, lado2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Colocar lado 1");
        lado1 = scanner.nextInt();

        System.out.println("Colocar lado 2");
        lado2 = scanner.nextInt();

        resultado = (int)(lado1*lado2);

        System.out.println("el resutado es :  "+resultado);

    }
    
}
