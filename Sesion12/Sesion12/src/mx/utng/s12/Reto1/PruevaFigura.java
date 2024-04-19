package mx.utng.s12.Reto1;

/**
 * @author: Pedro Uriel Perez Monzon
 * @date 6/02/2024
 * @group: GDS0624
 */

public class PruevaFigura {
    public static void main(String[] args) {
        Figura figura;
        figura = new Triangulo();
        figura.calcularaArea();

        figura = new Cuadrado();
        figura.calcularaArea();

        figura = new Rectangulo();
        figura.calcularaArea();

        
    }
}
