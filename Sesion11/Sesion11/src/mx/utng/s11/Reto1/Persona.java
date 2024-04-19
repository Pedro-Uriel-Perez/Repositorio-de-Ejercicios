package mx.utng.s11.Reto1;
import java.time.LocalDate;
//Pedro Urel Perez Monzon GDS0624

public class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate fechaNacimiento;
    
    public String getNombre() {
        return nombre;
    }
    public byte getEdad() {
        return edad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
