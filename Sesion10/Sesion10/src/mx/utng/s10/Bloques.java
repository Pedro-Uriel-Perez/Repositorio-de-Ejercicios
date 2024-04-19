package mx.utng.s10;

public class Bloques {
    
        private static final int valor = 10; // Inicializa la variable aquí con el valor de tu preferencia
    
        public static void muestraValor() {
            System.out.println("El valor es: " + valor);
        }
    
        public Bloques() {
            // Constructor vacío
        }
    
        public static void main(String[] args) {
            Bloques bloques = new Bloques();
            Bloques.muestraValor();
        }
    }
    
