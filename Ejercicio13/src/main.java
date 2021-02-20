import Modelo.Usuario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        Usuario user1 = null;
        int opcion, annioRegistro, opcionLogeo, opcionDatos;
        String email, password, emailRegistro = "", nombreRegistro;
        long movilRegistro;
        boolean salir = false, comprobarEmail = false, logueado = false, salirMenuDatos = false;

        do {
            System.out.println();
            System.out.println("\t\tMENU DE OPERACIONES");
            System.out.println("***************************************");
            System.out.println("1. Iniciar Sesion.");
            System.out.println("2. Registrarte.");
            System.out.println("3. Salir");
            System.out.println("***************************************");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    if (user1 == null) System.out.println("Todavia no has registrado ninguno usuario.");
                    else {
                        System.out.print("Introduzca tu email: ");
                        email = s.nextLine();
                        System.out.print("Introduca tu password: ");
                        password = s.nextLine();

                        if (email.equalsIgnoreCase(emailRegistro) && user1.claveValida(password)) {
                            logueado = true;
                        } else System.out.println("El email o password son incorrectos.");

                        while (logueado) {
                            System.out.println();
                            System.out.println("\tMENU DE USUARIO");
                            System.out.println("================================");
                            System.out.println("1. Datos Personales.");
                            System.out.println("2. Cambiar Datos Personales.");
                            System.out.println("3. Cerrar Sesion");
                            System.out.println("================================");
                            System.out.print("Introduzca una opcion: ");
                            opcionLogeo = Integer.parseInt(s.nextLine());
                            switch (opcionLogeo) {
                                case 1:
                                    System.out.println(user1);
                                    break;
                                case 2:
                                    do {
                                        System.out.println();
                                        System.out.println("\t\tDATOS PERSONALES");
                                        System.out.println("*********************************");
                                        System.out.println("1. Email.");
                                        System.out.println("2. Password.");
                                        System.out.println("3. Nombre.");
                                        System.out.println("4. Año de Nacimiento.");
                                        System.out.println("5. Movil.");
                                        System.out.println("6. Volver");
                                        System.out.print("Introduzca una opcion: ");
                                        opcionDatos = Integer.parseInt(s.nextLine());
                                        switch (opcionDatos){
                                            case 1:
                                                System.out.println("Tu email actual: " + user1.getEmail());
                                                System.out.print("Introduzca el email nuevo: ");
                                                String emailNuevo = s.nextLine();
                                                user1.setEmail(emailNuevo);
                                                break;
                                            case 2:
                                                System.out.println("Tu password actual: " + user1.getClave());
                                                System.out.print("Introduzca la password nueva: ");
                                                String passwordNueva = s.nextLine();
                                                user1.cambioClave(passwordNueva);
                                                break;
                                            case 3:
                                                System.out.println("Tu nombre actual: " + user1.getNombre());
                                                System.out.print("Introduzca el nombre nuevo: ");
                                                String nombreNuevo = s.nextLine();
                                                user1.setNombre(nombreNuevo);
                                                break;
                                            case 4:
                                                System.out.println("Tu año de Nacimiento actual: " + user1.getAnnio_Nacimiento());
                                                System.out.print("Introduzca el año de nacimiento nuevo: ");
                                                int annioNuevo = Integer.parseInt(s.nextLine());
                                                user1.setAnnio_Nacimiento(annioNuevo);
                                                break;
                                            case 5:
                                                System.out.println("Tu movil actual: " + user1.getMovil());
                                                System.out.print("Introduzca el movil nuevo: ");
                                                long movilNuevo = Long.parseLong(s.nextLine());
                                                user1.setMovil(movilNuevo);
                                                break;
                                            case 6: salirMenuDatos = true;
                                        }
                                    }while (!salirMenuDatos);
                                    break;
                                case 3: logueado = false;
                            }
                        }
                    }
                    break;
                case 2:
                    if (user1 != null) System.out.println("El usuario ya se ha registrado.");
                    else {
                        user1 = new Usuario();
                        while (!comprobarEmail) {
                            System.out.print("Introduzca tu email: ");
                            emailRegistro = s.nextLine();
                            if (user1.compruebaEmail(emailRegistro)) {
                                comprobarEmail = true;
                            } else System.out.println("El email es incorrecto, vuelve ha intentalo.");
                        }
                        System.out.print("Introduzca tu nombre: ");
                        nombreRegistro = s.nextLine();
                        System.out.print("Introduzca tu año de nacimiento: ");
                        annioRegistro = Integer.parseInt(s.nextLine());
                        System.out.print("Introduzca tu numero de telefono: ");
                        movilRegistro = Long.parseLong(s.nextLine());
                        user1 = new Usuario(emailRegistro, nombreRegistro, movilRegistro, annioRegistro);
                        break;
                    }
                case 3:
                    salir = true;
            }
        } while (!salir);
    }
}

