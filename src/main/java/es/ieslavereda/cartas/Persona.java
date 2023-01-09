package es.ieslavereda.cartas;

public class Persona {

    //ATTRIBUTES
    private EstadoCivil estadoCivil;
    private int edad;
    private double altura;
    private String nombre;


    //Constructores
    public Persona(EstadoCivil estadoCivil, int edad, String nombre) {
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 16;
        this.estadoCivil = EstadoCivil.SOLTERO;
    }

    public int total(int ... numeros) {
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum = numeros[i];
        }
        return sum;
    }

    public String total(String ... numeros) {
        return "0";
    }

    //GETTERS
    public EstadoCivil getEstadoCivil() { return estadoCivil;}
    public String getNombre() { return nombre;}

    //SETTERS
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    //METODO FUNCIONAL
    public boolean esMayor21() {
        return (edad>=21);
    }


}
