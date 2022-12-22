package es.ieslavereda.cartas;

public enum Day {

    MONDAY("Lunes", "Lundi"),
    TUESDAY("Martes","Mardi"),
    WEDNESDAY("Miércoles","Mercredi"),
    THURSDAY("Jueves","Jeudi"),
    FRIDAY("Viernes","Vendredi"),
    SATURDAY("Sábado","Samedi"),
    SUNDAY("Domingo","Dimanche");

    private String diaSpanish;
    private String diaFrancais;

    Day(String diaSpanish, String diaFrancais) {
        this.diaSpanish = diaSpanish;
        this.diaFrancais = diaFrancais;
    }


    public String getDiaSpanish() {
        return diaSpanish;
    }
    public String getDiaFrancais() {
        return diaFrancais;
    }

//    @Override
//    public String toString() {
//        return diaSpanish;
//    }

}
