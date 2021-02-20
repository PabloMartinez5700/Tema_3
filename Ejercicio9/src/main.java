/*
Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los métodos pueden
ser c, simplifica, multiplica, divide, etc.
 */

import Modelo.Fracción;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        Fracción f1 = new Fracción(6, 3);
        int opcion, num;

        do {
            System.out.println("\n\t\t\tMENU DEL OPERACIONES");
            System.out.println("****************************************");
            System.out.println("1. Invertir.");
            System.out.println("2. Simplicar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir");
            System.out.println("****************************************");
            System.out.print("Introduce una opcion: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    f1.invertir();
                    System.out.println("El resultado es: " + "\n" +  f1);
                    break;
                case 2:
                    f1.simplificar(3);
                    System.out.println("El resultado es: " + "\n" + f1);
                    break;
                case 3:
                    System.out.print("Introduce el numero: ");
                    num = Integer.parseInt(s.nextLine());
                    f1.multiplicar(num);
                    System.out.println("El resultado es: " + "\n" +  f1);
                    break;
                case 4:
                    System.out.print("Introduce el numero: ");
                    num = Integer.parseInt(s.nextLine());
                    f1.dividir(num);
                    System.out.println("El resultado es: " +  f1);
                    break;
            }
        } while (opcion != 5);
    }
}