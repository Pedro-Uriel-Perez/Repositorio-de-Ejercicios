package mx.utgn.pd.factory.absfactory;

public class CamionetaLujosa implements Camioneta{
    private String nombre;

    public CamionetaLujosa(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getCaracteristicas() {
        return "Esta camioneta cuenta con muchas caracteristicas de lujo";
    }

    
}