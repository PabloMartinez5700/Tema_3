import Modelo.Vehiculo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int opcion, idVehiculo;
        float km;
        boolean salir = false;

        // Creacion de Instancias
        Vehiculo v1 = new Vehiculo(1, 10.653f);
        Vehiculo v2 = new Vehiculo(2, 35.356f);
        Vehiculo v3 = new Vehiculo(3, 15.355f);
        Vehiculo v4 = new Vehiculo(4, 50.687f);
        Vehiculo v5 = new Vehiculo(5, 78.952f);


        do {
            System.out.println("\n\t\t\t\tVEHICULOS");
            System.out.println("==========================================");
            System.out.println("1. Ver los vehiculos.");
            System.out.println("2. Sumar kilometros a un vehiculo.");
            System.out.println("3. Consultar kilometraje de un vehiculo.");
            System.out.println("4. Consultar numero de vehiculos.");
            System.out.println("5. Ver kilometraje total.");
            System.out.println("6. Salir");
            System.out.println("==========================================");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1 -> {
                    System.out.println(v1);
                    System.out.println(v2);
                    System.out.println(v3);
                    System.out.println(v4);
                    System.out.println(v5);
                }
                case 2 -> {
                    System.out.print("Que vehiculo quieres consultar: ");
                    idVehiculo = Integer.parseInt(s.nextLine());
                    if (idVehiculo == v1.getId()) {
                        System.out.println("Tus kilometros recorridas actuales: " + v1.getKilometrosRecorridos());
                        System.out.print("¿Cuantos km le quieres añadir?: ");
                        km = Float.parseFloat(s.nextLine());
                        v1.sumarKilometros(km);
                    }
                    if (idVehiculo == v2.getId()) {
                        System.out.println("Tus kilometros recorridas actuales: " + v2.getKilometrosRecorridos());
                        System.out.print("¿Cuantos km le quieres añadir?: ");
                        km = Float.parseFloat(s.nextLine());
                        v2.sumarKilometros(km);
                    }
                    if (idVehiculo == v3.getId()) {
                        System.out.println("Tus kilometros recorridas actuales: " + v3.getKilometrosRecorridos());
                        System.out.print("¿Cuantos km le quieres añadir?: ");
                        km = Float.parseFloat(s.nextLine());
                        v3.sumarKilometros(km);
                    }
                    if (idVehiculo == v4.getId()) {
                        System.out.println("Tus kilometros recorridas actuales: " + v4.getKilometrosRecorridos());
                        System.out.print("¿Cuantos km le quieres añadir?: ");
                        km = Float.parseFloat(s.nextLine());
                        v4.sumarKilometros(km);
                    }
                    if (idVehiculo == v5.getId()) {
                        System.out.println("Tus kilometros recorridas actuales: " + v5.getKilometrosRecorridos());
                        System.out.print("¿Cuantos km le quieres añadir?: ");
                        km = Float.parseFloat(s.nextLine());
                        v5.sumarKilometros(km);
                    }
                }
                case 3 -> {
                    System.out.print("¿Que vehiculo quieres consultar?: ");
                    idVehiculo = Integer.parseInt(s.nextLine());
                    if (idVehiculo == v1.getId()) {
                        System.out.println("Kilometros recorridos: " + v1.getKilometrosRecorridos());
                    } else if (idVehiculo == v2.getId()) {
                        System.out.println("Kilometros recorridos: " + v2.getKilometrosRecorridos());
                    } else if (idVehiculo == v3.getId()) {
                        System.out.println("Kilometros recorridos: " + v3.getKilometrosRecorridos());
                    } else if (idVehiculo == v4.getId()) {
                        System.out.println("Kilometros recorridos: " + v4.getKilometrosRecorridos());
                    } else if (idVehiculo == v5.getId()) {
                        System.out.println("Kilometros recorridos: " + v5.getKilometrosRecorridos());
                    }
                }
                case 4 -> System.out.println("Vehiculos creados: " + Vehiculo.getVehiculosCreados());
                case 5 -> {
                    System.out.println("Kilometros totales: " + v1.getKilometrosTotales() + " km.");
                    System.out.println("Kilometros totales: " + v2.getKilometrosTotales() + " km.");
                    System.out.println("Kilometros totales: " + v3.getKilometrosTotales() + " km.");
                    System.out.println("Kilometros totales: " + v4.getKilometrosTotales() + " km.");
                    System.out.println("Kilometros totales: " + v5.getKilometrosTotales() + " km.");
                }
                case 6 -> salir = true;
            }
        }
        while (!salir);
    }
}
