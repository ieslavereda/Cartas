package es.ieslavereda.cartas;

import es.ieslavereda.utils.Input;

public class ProbarDias {

    public static void main(String[] args) {
        int diaNum = Input.getInteger("Please, enter a numeric day of the week: ");
        Day dia;

        if(diaNum == 1)
            dia = Day.MONDAY;
        else if(diaNum==2)
            dia = Day.TUESDAY;
        else if(diaNum==3)
            dia = Day.WEDNESDAY;
        else if(diaNum==4)
            dia = Day.THURSDAY;
        else if(diaNum==5)
            dia = Day.FRIDAY;
        else if(diaNum==6)
            dia = Day.SATURDAY;
        else if(diaNum==7)
            dia = Day.SUNDAY;
        else
            dia = null;

        if (dia!=null)
            System.out.println("Day of the week " + dia.getDiaSpanish() + " " + dia.getDiaFrancais());
        else
            System.out.println("Día incorrecto");

        String name = "Vicent";
        Persona vicent = new Persona(EstadoCivil.CASADO,25,name);
        System.out.println(vicent.getEstadoCivil());

        vicent.total(1,2,3,4);
        vicent.total(2);

        double nomina = 40000.00;
        double porcentaje = (double) vicent.getEstadoCivil().getRetencion()/100;
        double nominaNeto = nomina*(1-porcentaje);
        System.out.println(nominaNeto);

    }



}
