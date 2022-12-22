package es.ieslavereda.cartas;

public enum EstadoCivil {
    CASADO(21),
    SOLTERO(25),
    VIUDO(25),
    DIVORCIADO(30);

    private int retencion;
    EstadoCivil (int retencion) {
        this.retencion = retencion;
    }

    public int getRetencion() {
        return retencion;
    }
}
