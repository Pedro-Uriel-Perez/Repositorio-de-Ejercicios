package mx.utng.s13.Ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {

    public static void main(String[] args) {

        Profesor profe1 = new Profesor("Laura", "Hernandez Sanches", "UTNG 16253");
        profe1.mostrarDatos();
        
        Profesor profe2 = new ProfesorInterino("Andres", "LLanos", "UTNG00535", LocalDate.of(2024, Month.MARCH, 13));
        profe2.mostrarDatos();

        Persona p = new Persona("Claudia", "perez");
        p = new Profesor(p.getNombre(),p.getApellidos(),"Utng");
        p.mostrarDatos();






        }
    
}
