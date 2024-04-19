package mx.utng.s09;

public class Combustible {
    private Short litrosMaximos;
    private Short litrosActuales;

    public void usar(){
        litrosActuales--;
        System.out.println("quedan "+ litrosActuales);
    }

    public Short getLitrosActuales() {
        return litrosActuales;
    }

    public Short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosActuales(Short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public void setLitrosMaximos(Short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }



}
