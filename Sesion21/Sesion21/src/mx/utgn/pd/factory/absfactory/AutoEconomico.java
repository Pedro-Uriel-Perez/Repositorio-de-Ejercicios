package mx.utgn.pd.factory.absfactory;

public class AutoEconomico implements Auto{

    private String nombre;

    
    
    public AutoEconomico(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getCaracteristicas() {

        return "Auto economico con pocas caracteristicas";
    }

    
}
