package mx.utng.s12.Reto1;

/**
 * @author: Pedro Uriel Perez Monzon
 * @date 6/02/2024
 * @group: GDS0624
 */

public class Cuadrado implements Figura{

    private double lado;

    //Se asignan valores

    {
        lado = 50;
    }

    @Override
    public void calcularaArea() {
        System.out.println("El area del Cuadrado es : "+lado * lado);
    }
    

}
