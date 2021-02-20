import Modelo.Cuenta;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        Cuenta cuenta = new Cuenta("ES3200492502130123456789", "Pablo Martinez");
        System.out.println((cuenta.validarCuenta1() ? "La cuenta es valida" : "No es valida"));
        double num = 1428999912349612345678d;

        double result = 98 - (num % 97);

        System.out.println(result);


        do {
            System.out.println();
            System.out.println("\t\t\t\tMENU DEL BANCO");
            System.out.println("*******************************************************");
            System.out.println("1. Ver el número de cuenta completo (CCC‒ Código Modelo.Cuenta Cliente).");
            System.out.println("2. Ver el titular de la cuenta.");
            System.out.println("3. Ver el código de la entidad.");
            System.out.println("4. Ver el código de la oficina.");
            System.out.println("5. Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos\n" +
                    "        de control).");
            System.out.println("6. Ver los dígitos de control de la cuenta.");
            System.out.println("7. Realizar un ingreso.");
            System.out.println("8. Retirar efectivo.");
            System.out.println("9. Consultar saldo.");
            System.out.println("10. Validar a nivel Nacional.");
            System.out.println("11. Salir");
            System.out.println("*******************************************************");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("IBAN: " + cuenta.getIban());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Titular de la cuenta " + cuenta.getIban() + " es: " + cuenta.getTitular());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Codigo de Entidad de la Cuenta " + cuenta.getIban() + " es: " + cuenta.extraerCodigoEntidad());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Codigo de la Oficina de la Cuenta " + cuenta.getIban() + " es: " + cuenta.extraerCodigoOficina());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Numero de Cuenta es: " + cuenta.extraerNumeroCuenta());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Numeros de control: " + cuenta.digitosControl());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 7:
                    System.out.println();
                    System.out.print("Introduzca la cantidad que quieres ingresar: ");
                    float saldo = Float.parseFloat(s.nextLine());
                    cuenta.ingreso(saldo);
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 8:
                    System.out.println();
                    System.out.print("Introduzca la cantidad que quieres retirar: ");
                    saldo = Float.parseFloat(s.nextLine());
                    cuenta.reintegro(saldo);
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 9:
                    System.out.println();
                    System.out.printf("Saldo actual: %.2f€", cuenta.getSaldo());
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 10:
                    System.out.println();
                    System.out.println("Numero de Entidad: " + cuenta.extraerCodigoEntidad());
                    System.out.print("Introduce la entidad: ");
                    String entidad = s.nextLine();
                    System.out.println("Numero de Oficina: " + cuenta.extraerCodigoOficina());
                    System.out.print("Introduce la oficina: ");
                    String oficina = s.nextLine();
                    System.out.println("Numero de Cuenta: " + cuenta.extraerNumeroCuenta());
                    System.out.print("Introduce el numero de cuenta: ");
                    String numCuenta = s.nextLine();
                    System.out.println();
                    System.out.println("Su numero de control: " + Cuenta.sacarPrimerDigitoCotrol(entidad, oficina) + Cuenta.sacarSegundoDigitoCotrol(numCuenta));
                    System.out.println();
                    System.out.println("Pulsa una tecla para continuar...");
                    s.nextLine();
                    break;
                case 11: salir = true;
            }
        } while (!salir);
    }
}
