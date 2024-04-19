package mx.utng.Sesion04;

public class ContadorCaracteres {
    
    public boolean isVocal(char caracter){
        caracter = Character.toLowerCase(caracter);
        return caracter == 'a'
                            ||caracter =='e'
                            ||caracter =='i'
                            ||caracter =='o'
                            ||caracter =='u';
    }
    public boolean isConsonante(char caracter){
        short codigoAscii = (short)Character.toLowerCase(caracter);
        return(codigoAscii >=97 && codigoAscii <=122) && !isVocal(caracter);
    }

    public boolean isNumero(char caracter){
        short codigoAscii =(short)caracter;

        return codigoAscii >= 48 && codigoAscii <= 57;
    }

    public boolean isSimbolo(char caracter){
        return !(isVocal(caracter) || isNumero(caracter) || isConsonante(caracter));
    }




    public int cuentaVocales(String palabra){
        int vocales = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()){
            if(isVocal(caracter)){
                vocales++;
            }
        }
        return vocales;
    }

    public int cuentaConsonante(String palabra){
        int Consonante = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()){
            if(isConsonante(caracter)){
                Consonante++;
            }
        }
        return Consonante;
    }

    public int cuentaNumero(String palabra){
        int Numero = 0;
        for (char caracter : palabra.toCharArray()){
            if(isNumero(caracter)){
                Numero++;
            }
        }
        return Numero;
    }

    public int cuentaSimbolo(String palabra){
        int Simbolo = 0;
        for (char caracter : palabra.toCharArray()){
            if(isSimbolo(caracter)){
                Simbolo++;
            }
        }
        return Simbolo;
    }
}