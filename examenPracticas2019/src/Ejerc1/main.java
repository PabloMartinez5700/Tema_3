package Ejerc1;

public class main {
    public static void main(String[] args) {
        Domino ficha1 = new Domino(0,2);
        Domino ficha2 = new Domino(4,0);
        Domino ficha3 = new Domino(1,3);

        Domino ficha4 = new Domino(2,1);
        Domino ficha5 = new Domino(2,5);
        Domino ficha6 = new Domino(5,0);

        Jugador jug1 = new Jugador("Carlos",ficha1,ficha2,ficha3);
        Jugador jug2 = new Jugador("Pepe",ficha4,ficha5,ficha6);
        jug1.calcularPuntos();
        jug2.calcularPuntos();

        System.out.println();
        System.out.println("\t\tDATOS JUGADOR 1");
        System.out.println("============================");
        System.out.println(jug1);
        System.out.println();
        System.out.println("\t\tDATOS JUGADOR 2");
        System.out.println("============================");
        System.out.println(jug2);
    }
}
