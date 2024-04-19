import mx.utng.eje001.Autor;
import mx.utng.eje001.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor();
        autor.setName("Panchito");
        autor.setApellido("Torres");
        autor.setEdad(18);

        Libro Libro = new Libro();
        Libro.setTitulo("Reglas para seducir");
        Libro.setAutor(autor);
        Libro.setNumeroPaginas(30);
        
        System.out.println("Libro: "+Libro.getTitulo());
        System.out.println("Autor "+Libro.getAutor().getName()
        +" "+Libro.getAutor().getApellido());
    }
}
