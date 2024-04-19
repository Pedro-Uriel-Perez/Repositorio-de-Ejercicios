package mx.utng.s10;

public class MiembrosEstaticos {

    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        Contador contador4 = new Contador();

        System.out.println("Contador.contadorClase: "+contador1.getContadorClase());
        System.out.println("Contador1.contadorInstancia:"+contador1.getContadorInstancia());

        Contador.setContadorClase((short)10000);
        contador1.setContadorInstancia((short)10);
        contador2.setContadorInstancia((short)30);
        Contador.setContadorClase((short)3000);
        contador3.setContadorInstancia((short)550);
        contador4.setContadorInstancia((short)440);


        System.out.println("contado 2 instacncia: "+contador2.getContadorInstancia());
        System.out.println("contado 2 Clase: "+Contador.getContadorClase());
        System.out.println("contado 3 instacncia: "+contador3.getContadorInstancia());
        System.out.println("contado 3 Clase: "+Contador.getContadorClase());
        System.out.println("contado 4 instacncia: "+contador4.getContadorInstancia());
        System.out.println("contado 4 Clase: "+Contador.getContadorClase());



    }
}
