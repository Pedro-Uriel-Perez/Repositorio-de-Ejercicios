package mx.utng.s30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();

        String [] nombre = {"UNO", "DOS", "DOS"};

        for (String nombre : nombres){
            pool.execute(new);
        }
    }
}
