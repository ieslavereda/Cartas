package es.ieslavereda.cartas;

public class Baraja {
    private String[] palos = {"o", "b", "e", "c"};
    private Carta[] cartas;

    public Baraja() {
        cartas = new Carta[48];
        int j=0;
        for(String palo : palos) {
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
