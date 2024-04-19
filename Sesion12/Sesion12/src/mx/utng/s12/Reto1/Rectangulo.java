package mx.utng.s12.Reto1;

/**
 * @author: Pedro Uriel Perez Monzon
 * @date 6/02/2024
 * @group: GDS0624
 */

public class Rectangulo implements Figura {

    private double base;
    private double altura;

        //Se asignan valores

    {
        base = 40;
        altura = 30;
    }

    @Override
    public void calcularaArea() {
        System.out.println("El area del Rectangulo es : "+base * altura);
    }



    
}
