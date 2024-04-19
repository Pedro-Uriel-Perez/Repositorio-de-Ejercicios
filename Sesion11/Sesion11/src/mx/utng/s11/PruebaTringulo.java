package mx.utng.s11;

public class PruebaTringulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10.0,10.0, "color crema");
        System.out.println("Info del triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.err.println("su area es :"+triangulo.area());


    }
    
}
