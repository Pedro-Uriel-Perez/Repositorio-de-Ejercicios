package mx.utng.s08;

public class Fabrica {
    
    public static void main(String[] args) {
        Automovil auto1 = new Automovil ("Toyota", "Model 1900", 1888, 40000);

        Automovil auto2 = new Automovil ("Jetta", "Model 2004", 2000, 15000);

        Automovil auto3 = new Automovil("Tesla", "Senior", 2018, 20000);

        System.out.println("Auto 1: hash"+ auto1.hashCode());
        System.out.println("Auto 2: hash"+ auto2.hashCode());
        System.out.println("Auto 3: hash"+ auto3.hashCode());
    }
}