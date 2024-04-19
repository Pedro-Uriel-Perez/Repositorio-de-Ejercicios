package mx.utng.s05;

public class Primitivos {

    //  Pedro Uriel Perez Monzon GDS0614

    public static void main(String[] args) {
        //Entero muy pequeno  de (-128 a 127)
        byte valorByte = -127;
        System.out.println(valorByte);

        // Entero corto de (-37768 a 32767)
        short ValorShort= 32767;
        System.out.println(ValorShort);

        
        // Entero base de (-2147483648 a 2147483648)
        int ValorInt = 2000000000;
        System.out.println(ValorInt);

        // Entero long de (-9223372036854775808 a 9223372036854775807)
        long ValorLong = 9223372036854775807L;
        System.out.println(ValorLong);


        // Numero real tiene punto deimal es de (6 cifras despues del punto)
        float ValorFloat = 10.333333F;
        System.out.println("flotante: "+ ValorFloat);


        //Numero real con doble precision (16 cifras despues del punto) 
        Double ValorDouble = 3.50000000000000007;
        System.out.println(ValorDouble);


        //Valor boleano con solo dos valores posibles true/false
        boolean ValorBoolean = true;
        System.out.println(ValorBoolean);


        //Primitivo para texto
        char ValorChar = 'b';
        System.out.printf("Valor booleano: %b  %nValor caracter: %c%n", ValorBoolean,ValorChar);


        float numFloat = 1F;
        int numInt1 = (int)numFloat;
        System.out.printf("flotante: %1.1f, Entero: %d%n", numFloat, numInt1);


    

        

    



    }

}
