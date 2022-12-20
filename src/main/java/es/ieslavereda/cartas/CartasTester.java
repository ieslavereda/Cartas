package es.ieslavereda.cartas;

public class CartasTester {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Jugador j1 = new Jugador("Pepa");

        baraja.shuffle();
        System.out.println(baraja.toString());
    }
}

//
