package es.ieslavereda.cartas;

public class Carta {
    private Palo palo;
    private int numero;

    public Carta(Palo palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getNumero() {return numero;}
    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " " + palo;
    }
}
