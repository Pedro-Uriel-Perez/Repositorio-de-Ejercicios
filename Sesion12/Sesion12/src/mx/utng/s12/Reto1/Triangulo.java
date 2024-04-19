package mx.utng.s12.Reto1;

/**
 * @author: Pedro Uriel Perez Monzon
 * @date 6/02/2024
 * @group: GDS0624
 */

public class Triangulo implements Figura{

    private double base;
    private double altura;

        //Se asignan valores

    {
        base= 10;
        altura= 20;
    }

    @Override
    public void calcularaArea() {
        System.out.println("El area del triangulo es : "+base * altura / 2);
    }


    



    
}
