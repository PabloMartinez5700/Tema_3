/*
Haz una lista con los atributos que podría tener la clase caballo. A continuación, haz una lista con
los posibles métodos (acciones asociadas a los caballos). Implementa la clase.
 */

import Modelo.Caballo;

public class main {
    public static void main(String[] args) {
        Caballo c1 = new Caballo("Pura Sangre","blanco","hembra","Inglatera",10,500, 1.70f);
        Caballo c2 = new Caballo("Pura raza Española","negro","macho","España",12,500,1.80f);


        System.out.println(c1);
        c1.esCumpleaños();
        System.out.println(c1);
    }
}
