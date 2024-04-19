package mx.utng.s11.Reto1;
//Pedro Urel Perez Monzon GDS0624

import java.time.LocalDate;

public class DBA extends Empleado{
    private String herramientasConsulta;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientasConsulta) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientasConsulta = herramientasConsulta;
    }

    public void setHerramientasConsulta(String herramientasConsulta) {
        this.herramientasConsulta = herramientasConsulta;
    }

    public String getHerramientasConsulta() {
        return herramientasConsulta;
}

}