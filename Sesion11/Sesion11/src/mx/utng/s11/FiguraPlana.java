package mx.utng.s11;

public class FiguraPlana {
    private final double BASE;
    private final double ALTURA;

    public FiguraPlana(double base, double altura) {
        this.BASE = base;
        this.ALTURA = altura;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public double getBASE() {
        return BASE;
    }

    public void mostrarDimension(){
        System.out.printf("la base dee la figura es: %f y la altura es %f.%n",BASE, ALTURA);
    }

    


    
}
