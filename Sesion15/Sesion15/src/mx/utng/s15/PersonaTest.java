package mx.utng.s15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonaTest {public static void main(String[] args) {

    Persona persona1 = new Persona("Reynaldo", "Peña", 1.8F);
    Persona persona2 = new Persona("Pdro", "Avalos", 1.7F);
    Persona persona3 = new Persona("Jose", "Lara", 1.65F);
    Persona persona4 = new Persona("Alan", "Salazar", 1.87F);
    Persona persona5 = new Persona("Hector", "Gimenez", 1.74F);

    List<Persona> personas = new ArrayList<>();
    Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);

    for (Persona persona : personas) {
        System.out.println(persona.getNombre()+ " "+ persona.getApellidos()+" : "+persona.getEstatura());
        
    }

    //Comparando personas

    for (Persona persona : personas) {
        System.out.println(persona1.compareTo(persona));
        
    }

}

}
