package mx.utgn.pd.factory.absfactory;

public abstract class VehiculoFactory {
    private static final String VehiculoLujo = "Lujo";
    private static final String VehiculoEconomico = "Economico";

    public static String getVehiculoeconomico() {
        return VehiculoEconomico;
    }

    public static String getVehiculolujo() {
        return VehiculoLujo;
    }


}
