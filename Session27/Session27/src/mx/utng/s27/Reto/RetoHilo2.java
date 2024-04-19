package mx.utng.s27.Reto;

import java.util.concurrent.TimeUnit;

public class RetoHilo2 implements Runnable {
    private volatile boolean ejecutando = true;

    public void detener() {
        ejecutando = false;
    }

    @Override
    public void run() {
        while (ejecutando) {
            System.out.println("Hilo 2: sigo en ejecución");

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                // Es buena práctica restaurar el estado de interrupción
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
