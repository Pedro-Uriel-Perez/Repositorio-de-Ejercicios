package mx.utng.s14;

public class Libro implements Comparable<Libro>{
    private  final String TITULO;
    private int proridad;

    public Libro(String titulo, int proridad) {
        this.TITULO = titulo;
        this.proridad = proridad;
    }

    public String getTITULO() {
        return TITULO;


    }

    @Override
    public int compareTo(Libro libro) {
        return this.proridad = libro.proridad;
        
    }
}
