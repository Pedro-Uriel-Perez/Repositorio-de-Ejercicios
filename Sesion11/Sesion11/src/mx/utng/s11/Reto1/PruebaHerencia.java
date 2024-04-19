package mx.utng.s11.Reto1;
//Pedro Urel Perez Monzon GDS0624

import java.time.LocalDate;
import java.time.Month;

public class PruebaHerencia {
    public static void main(String[] args) {

        Programador programador = new Programador("Pedro", (byte)19, LocalDate.of
        (2004, Month.MARCH, 14), 40000.00f, "Java");
    
        System.out.println("Programador: ");

        System.out.println("Nombre: "+ programador.getNombre());

        System.out.println("Edad: "+ programador.getEdad());

        System.out.println("Fecha de nacimiento: "+ programador.getFechaNacimiento());

        System.out.println("Salario: "+ programador.getSalario());

        System.out.println("Lenguaje principal: "+ programador.getLenguajePrincipal());

        DBA dba = new DBA("Paulina", (byte)19, LocalDate.of
        (2004, Month.JANUARY, 02), 30000.00f, "SQL");

        System.out.println("Administrador: ");

        System.out.println("Nombre: "+ dba.getNombre());

        System.out.println("Edad: "+ dba.getEdad());

        System.out.println("Fecha de nacimiento: "+ dba.getFechaNacimiento());

        System.out.println("Salario: "+ dba.getSalario());

        System.out.println("Herramientas de consulta: "+ dba.getHerramientasConsulta());
    }
}
