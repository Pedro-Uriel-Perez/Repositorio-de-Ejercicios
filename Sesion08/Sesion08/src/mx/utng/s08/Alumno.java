package mx.utng.s08;

public class Alumno {
    
    private String curso;
    private Byte sesion;
    private String objetivo;

    {
        curso = "Programacion orinetada a objetos";
        sesion = 8;
        objetivo ="aprender el paradigma de POO";

    }

    {
        curso = "Como pintar uñas";
        sesion = 10;
        objetivo = "Ganar dinero";

    }

    public String getCurso() {
        return curso;
    }

    public Byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSesion(Byte sesion) {
        this.sesion = sesion;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }


}
