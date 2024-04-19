package mx.utng.s17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;




public class Binario {
    public static void main(String[] args) throws FileNotFoundException{
        //Declaramos instancia de BufferteInputStrint

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Mario.png"));

        //declaramos una instancia de bufferdOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("hdhs"));

        //definimos el buffer de escritura de datos

        byte[] bufer = new byte[1024];
        //iniciar la copia del archivo
        
        int byteLeidos = 0;
        while ((byteLeidos= bis.red(bufer)) > 0) {
            bos.write(bufer, 0, byteLeidos);
            
        }

        bos.close();
        bis.close();
        
    }
    
}
