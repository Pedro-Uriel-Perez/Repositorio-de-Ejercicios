package mx.utng.s09;

public class Llanta {

    //variables de instancia
    private Float ancho;
    private float diametro;
    private float presion;

    public void rodar(){
        System.out.println("Rodando");
    }
    

    //getters y setters
    public Float getAmcho() {
        return ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setAmcho(Float amcho) {
        this.ancho = amcho;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

}
