package es.ieslavereda.cartas;

public enum Palo {
    HEART("\u2665"),
    SPADE("\u2660"),
    DIAMOND("\u2666"),
    CLUB("\u2663");

    private String shape;
    private Palo(String shape) {
        this.shape = shape;
    }

@Override
    public String toString() {
        return shape;
}

}
