package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class MiRunnable implements Runnable{
   
    private String parametro;
    private String nombre;

    public MiRunnable(String nombre){
        this.nombre = nombre;
    }


    //setter de paramtro
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    //metodo sobrescrito de la interfaz runnable
    @Override
    public void run(){
        while (!"Terminar".equals(parametro)) {
            mostarInformacion();
            pausarUnSegundo();

            
        }
        mostarInformacion();

    }

    //
    public static void pausarUnSegundo(){
        try{
            TimeUnit.SECONDS.sleep(1);

        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }

    private void mostarInformacion(){
System.out.println("Hilo: "+nombre + "\t| Parametro: "+ parametro);
    }
}
