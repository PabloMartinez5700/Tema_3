import Modelo.Pizza;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int opcion;
        Pizza p1 = null;
        Pizza p2 = null;
        Pizza p3 = null;

        do {
            System.out.println("\n\t\t\tMENU DEL TELEPIZZA");
            System.out.println("****************************************");
            System.out.println("1. Pedir una pizza.");
            System.out.println("2. Servir una pizza.");
            System.out.println("3. Ver mis pizzas.");
            System.out.println("4. Consultar el estado de las pizzas.");
            System.out.println("5. Salir");
            System.out.println("****************************************");
            System.out.print("Introduce una opcion: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1 -> {
                    System.out.println("\n");
                    if (p1 == null) {
                        System.out.print("Introduce el tipo de la pizza que desees: ");
                        String tipo = s.nextLine();
                        System.out.print("Introduce el tamaño de la pizza que desees: ");
                        String tamanio = s.nextLine();
                        p1 = new Pizza(1, tipo, tamanio);
                    } else if (p2 == null) {
                        System.out.print("Introduce el tipo de la pizza que desees: ");
                        String tipo = s.nextLine();
                        System.out.print("Introduce el tamaño de la pizza que desees: ");
                        String tamanio = s.nextLine();
                        p2 = new Pizza(2, tipo, tamanio);
                    } else if (p3 == null) {
                        System.out.print("Introduce el tipo de la pizza que desees: ");
                        String tipo = s.nextLine();
                        System.out.print("Introduce el tamaño de la pizza que desees: ");
                        String tamanio = s.nextLine();
                        p3 = new Pizza(3, tipo, tamanio);
                    } else System.out.println("Lo siento, solo puedes pedir 3 pizzas.");
                    System.out.println("\n");
                    System.out.println("Pulsa una tecla para continuar....");
                    s.nextLine();
                }
                case 2 -> {
                    if ((p1 == null) && (p2 == null) && (p3 == null)) System.out.println("Todavia no has pedido ninguna pizza.");
                    else {
                        System.out.print("Introduzca el codigo de la pizza que quieres servir: ");
                        int codigo = Integer.parseInt(s.nextLine());
                        if (codigo == p1.getCodigo()) System.out.println((p1.sirve() ? "La pizza con la id " + p1.getCodigo() + " ha sido servida" : "No puedes servir dos veces la misma pizza."));

                        if (p2 != null) {
                            if (codigo == p2.getCodigo()) System.out.println((p2.sirve() ? "La pizza con la id " + p2.getCodigo() + " ha sido servida" : "No puedes servir dos veces la misma pizza."));
                        }

                        if (p3 != null) {
                            if (codigo == p3.getCodigo()) System.out.println((p3.sirve() ? "La pizza con la id " + p3.getCodigo() + " ha sido servida" : "No puedes servir dos veces la misma pizza."));
                        }
                    }
                    System.out.println("\n");
                    System.out.println("Pulsa una tecla para continuar....");
                    s.nextLine();
                }
                case 3 -> {
                    if ((p1 == null) && (p2 == null) && (p3 == null)) System.out.println("Todavia no has pedido ninguna pizza.");
                    else {
                        System.out.println(p1);
                        System.out.println((p2 != null) ? p2 : "");
                        System.out.println((p3 != null) ? p2 : "");
                    }
                    System.out.println("\n");
                    System.out.println("Pulsa una tecla para continuar....");
                    s.nextLine();
                }
                case 4 -> {
                    System.out.println("Pedidas: " + Pizza.getPedidasTotales());
                    System.out.println("Servidas: " + Pizza.getServidasTotales());
                    System.out.println("\n");
                    System.out.println("Pulsa una tecla para continuar....");
                    s.nextLine();
                }
            }
        } while (opcion != 5);
    }
}
