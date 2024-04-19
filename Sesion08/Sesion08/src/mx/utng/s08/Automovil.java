package mx.utng.s08;

public class Automovil {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private int kilometraje;



    public Automovil (String marca, String modelo, int añoFabricacion, int kilometraje) {

        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.kilometraje = kilometraje;

    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public int getAñoFabricacion() {
        return añoFabricacion;
    }



    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }



    public int getKilometraje() {
        return kilometraje;
    }



    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }


    @Override
public int hashCode() {
    int hash = 0;
    hash += marca.hashCode();
    hash += modelo.hashCode();
    hash += Integer.hashCode(añoFabricacion);
    hash += Integer.hashCode(kilometraje);

    return hash;
}


    

    

}
