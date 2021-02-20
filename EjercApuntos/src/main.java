import Modelo.Cuenta;
import Modelo.Dni;


public class main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        Dni dni1 = new Dni();


        System.out.println("Banco: " + Cuenta.banco);

        /**
         * Para acceder a la variable "saldo" hay que declarar como public
         */
        // c1.saldo = 1000f;

        System.out.println("Saldo actual: " + c1.leerSaldo());
        System.out.println(c1.enRojos());
        System.out.println("Cuentas creadas: " + Cuenta.contadorCuentas);
        System.out.println("\n");

        if (!dni1.setDni("77322947V")) System.out.println("El dni introducido, no es válido.");
        else {
            System.out.println("El dni 7732247V, es válido.");
            System.out.println("DNI: " + dni1.getDni());
            System.out.println("NIF: " + dni1.getNif());
        }

        if (!dni1.setDni("77322947Y")) System.out.println("El dni introducido, no es válido.");
        else {
            System.out.println("El dni 7732247Y, es válido.");
            System.out.println("DNI: " + dni1.getDni());
            System.out.println("NIF: " + dni1.getNif());
        }
    }
}

