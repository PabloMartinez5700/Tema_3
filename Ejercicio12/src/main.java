import Modelo.Recinto;
import Modelo.Zona;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        Zona z1 = new Zona("PRINCIPAL", 1000, 5);
        Zona z2 = new Zona("COMPRA - VENTA", 200, 10);
        Zona z3 = new Zona("VIP", 25, 20);
        Recinto recinto = new Recinto(1, z1, z2, z3);
        boolean salir = false;
        int opcion, codigo, cantEntradas;

        System.out.println(recinto);
        do {
            System.out.println("\n\t\t\t\tMENU");
            System.out.println("***********************************");
            System.out.println("1. Mostrar numeros de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir");
            System.out.println("***********************************");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Total entradas libres: " + recinto.totalEntradasLibres());
                    break;
                case 2:
                    System.out.println("1. PRINCIPAL.");
                    System.out.println("2. COMPRA - VENTA");
                    System.out.println("3. VIP");
                    System.out.println();
                    System.out.print("Introduzca el codigo de la zona: ");
                    codigo = Integer.parseInt(s.nextLine());
                    System.out.println("Cantidad de entradad que desees: ");
                    cantEntradas = Integer.parseInt(s.nextLine());
                    System.out.println((recinto.venderEntradaZona(codigo, cantEntradas) ? "Aqui tiene su entradas" : "No hay entradas disponibles."));
                    System.out.println("Precio total: " + recinto.calculcarPrecio(codigo, cantEntradas));
                    break;
                case 3:
                    salir = true;
            }
        } while (!salir);
    }
}
