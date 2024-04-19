package mx.utgn.pd.factory.absfactory;

public class CamionetaEconomica implements Camioneta{
    private String nombre;

    public CamionetaEconomica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getCaracteristicas() {
        return "Esta camioneta cuenta con pocas caracteristicas de lujo";
    }

    
}
