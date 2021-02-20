/*
Desarrolla la clase GatoSimple con los atributos: Color, raza y sexo (String), edad (int), hambre
(Boolean) y peso (double). Los métodos son: Constructor, setters, getters, tieneHambre, come (le
pasamos un String con el tipo de comida, si no es pescado no come), peleaCon (le pasamos un
objeto tipo GatoSimple, la pelea solo ocurre cuando es entre dos machos). Elabora una clase main
y prueba todos los métodos.
 */


import Modelo.GatoSimple;

public class main {
    public static void main(String[] args) {
        //Creacion de instacias
        GatoSimple g1 = new GatoSimple("negro", "siames", "macho", 6, false, 3.6);
        GatoSimple g2 = new GatoSimple("blanco", "siames", "macho", 8, false, 4.05);
        GatoSimple g3 = new GatoSimple("amarillo","siames","hembra",3,true,3.8);

        String comida = "jamon";


        String comida1 = "pescado";

        //Funcionalidad de metodos
        System.out.println("¿Ha comido?: " + g1.come(comida));
        System.out.println("¿Ha comido?: " + g1.come(comida1));
        System.out.println("Tiene hambre: " + g1.tieneHambre());
        System.out.println("Tiene hambre: " + g3.tieneHambre());
        System.out.println("Gatos peleados: " + g1.pelaCon(g3));
        System.out.println("Gatos peleados: " + g1.pelaCon(g2));
    }
}

