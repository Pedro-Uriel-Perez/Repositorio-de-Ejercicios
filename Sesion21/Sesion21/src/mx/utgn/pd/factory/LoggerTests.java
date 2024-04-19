package mx.utgn.pd.factory;

import java.util.Scanner;

public class LoggerTests {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log("Este es el mensaje a mostarar");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el tipo de registro a realizar");
        int tipo = scanner.nextInt();
        scanner.close();
        logger = factory.getLogger(tipo);
        logger.log("Este fue un tipo de logger elegigo por el usuario");


    }
}
