package mx.utng.s15;

public class Persona implements Comparable <Persona> {

    private String nombre;
    private String apellidos;
    private float estatura;


    public Persona(String nombre, String apellidos, float estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    
   public float getEstatura() {
        return estatura;
    }

    @Override
    public int compareTo(Persona p) {
        return Float.compare(this.estatura, p.estatura);

       
    }
    




    
}
