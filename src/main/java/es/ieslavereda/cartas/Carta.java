package es.ieslavereda.cartas;

public class Carta {
    private Palo palo;
    private Valor numero;

    public Carta(Palo palo, Valor numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Valor getNumero() {return numero;}
    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero.toString() + " " + palo;
    }
}
