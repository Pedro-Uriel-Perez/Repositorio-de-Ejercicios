/** @autor:  Pedro Uriel Perez Monzon
 * @fecha: 16/Feb/2024
 * @grupo: GDS0624
 **/
package mx.utng.s17;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RetoPoema {
    public static void main(String[] args) throws IOException {
        

            FileWriter fw = new FileWriter("C:\\Users\\piter\\OneDrive\\Escritorio\\PROGRAMACION\\Sesion17\\Sesion17\\src\\mx\\utng\\s17\\RetoPoema.txt");

        
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Poema ----> Pedro Uriel Perez Monzon GDS0624.\n\n");
            bw.write("Bajo el cielo estrellado, donde los suenos son abrazados,");
            bw.newLine();
            bw.write("una luna llena se alza, y la noche se desliza. \n");
            bw.write("El viento susurra historias, de amores y viejas glorias,");
            bw.newLine();
            bw.write("mientras el mundo duerme tranquilo, bajo el manto del infinito.");
            bw.write("\n\n");
            bw.write("Las estrellas parpadean, como ojos que nos miran,");
            bw.newLine();
            bw.write("contemplando nuestras vidas, en silencio, desde arriba. \n");
            bw.write("Cada una es un deseo, un sueno que aun no hemos hecho,");
            bw.newLine();
            bw.write("esperando en el firmamento, a que lo descubramos.");
            bw.write("\n\n");
            bw.write("La noche es un lienzo, donde pintamos nuestros suenos,");
            bw.newLine();
            bw.write("con pinceladas de esperanza, y colores de deseo. \n");
            bw.write("Cada estrella es un poema, una historia sin contar,");
            bw.newLine();
            bw.write("un secreto del universo, que la noche nos revelara.");
            bw.close();

        
            FileReader fr = new FileReader("C:\\Users\\piter\\OneDrive\\Escritorio\\PROGRAMACION\\Sesion17\\Sesion17\\src\\mx\\utng\\s17\\RetoPoema.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = null;

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
        }
    }

