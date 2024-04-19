package mx.utng.s15.RetoS15;

import java.util.Comparator;

public class ComparadorPersona implements Comparator<ComparadorPersona>{
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    @Override
    public int compare(ComparadorPersona p1, ComparadorPersona p2) {
        String nombreCompletoPersona1 = p1.getNombre()+p1.getApellido();
        String nombreCompletoPersona2 = p2.getNombre()+p2.getApellido();
    }




    
    
}
