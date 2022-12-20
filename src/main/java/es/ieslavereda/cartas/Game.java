package es.ieslavereda.cartas;

public class Game {

    private Baraja baraja;
    private Jugador[] jugadores;
    private Jugador pc;

    public Game(Jugador[] jugadores){
        baraja = new Baraja();
        this.jugadores = jugadores;
        pc = new Jugador("PC");
    }

    public void start() {
        baraja.shuffle();
        for(Jugador player : jugadores) {
            juegaJugador(player);
        }
        juegaPC();
        mostrarGanador();
    }

}
