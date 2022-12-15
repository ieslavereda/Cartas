package es.ieslavereda.cartas;

public class Baraja {
    Palo palos;
    private Carta[] cartas;

    public Baraja() {
        cartas = new Carta[48];
        int j=0;
        for(Palo palo : Palo.values()){
            for (int i = 1; i <= 12; i++) {
                cartas[j++] = new Carta(palo,i);
            }
        }
    }

    @Override
    public String toString() {
        String barajaCadena ="";
        for(Carta carta : cartas)
            barajaCadena += carta.toString() + "\n";
        return barajaCadena;
    }

}
