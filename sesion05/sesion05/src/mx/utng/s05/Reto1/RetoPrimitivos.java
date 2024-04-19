package mx.utng.s05.Reto1;

public class RetoPrimitivos {
    public static void main(String[] args) { 

        //Tarer todos los tipos de datos rpimitivos e imprimir su valor minimo y maximo
        // utilizando en una solo instruccion la funcion printf (Byte,Short, Int, Long, Char, Boolean
        //float, double)
        
        byte valorByte = Byte.MAX_VALUE;
        valorByte++;
        System.out.println(valorByte);


        int valorInt = Integer.MAX_VALUE;
        valorInt++;
        System.out.println(valorInt);


        Short valorShort = Short.MAX_VALUE;
        valorShort++;
        System.out.println(valorShort);


        Long valorLong = Long.MAX_VALUE;
        System.out.println(valorLong);


        char valorChar1 = Character.MAX_VALUE;
        valorChar1++;
        System.out.println(valorChar1);

        
        double valorDouble = Double.MAX_VALUE;
        System.out.println(valorDouble);
        

        float valorFloat = Float.MAX_VALUE;
        System.out.println(valorFloat);
        





    }
    
}
