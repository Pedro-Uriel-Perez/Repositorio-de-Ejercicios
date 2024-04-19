package mx.utng.s12;

public class Polimorfismo {
    public static void main(String[] args) {
        //Creo cun objeto v de la clase venado
        Venado v = new Venado();

        Animal a = v;

        Hervivoro h = v;

        Object o = v;

        // Scanner s = v;      no aplica

        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Animal: "+(a instanceof Animal));
        System.out.println("Hervivoro: "+(h instanceof Hervivoro));
        System.out.println("Objet: "+ (o instanceof Object));
        // System.out.println("Scanner "+(v instanceof Scanner)); no aplica




    }
    
}
