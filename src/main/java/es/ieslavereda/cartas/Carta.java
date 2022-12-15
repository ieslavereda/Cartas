package es.ieslavereda.cartas;

public class Carta {
    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getNumero() {return numero;}
    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " " + palo;
    }
}
