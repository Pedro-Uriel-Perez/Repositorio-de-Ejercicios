package mx.utng.s30;

public class MirunnableTest {
    public static void main(String[] args) {
        MiRunnable runnable1 = new MiRunnable("Uno");

        MiRunnable runnable2 = new MiRunnable("DOS");

        Thread t1 = new Thread(runnable1);
        t1.start();


        Thread t2 =new Thread(runnable2);
        t2.setDaemon(true);
        t2.start();

        MiRunnable.pausarUnSegundo();
        runnable1.setParametro("Terminar");
        System.out.println("**Fin de hilo main**");

    }
}
