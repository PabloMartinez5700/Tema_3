

import Modelo.Propietario;
import Modelo.Vivienda;

import java.util.Scanner;

public class main {
    final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Vivienda v1 = null;
        Vivienda v2 = null;
        Vivienda v3 = null;

        Propietario p1 = null;
        Propietario p2 = null;
        Propietario p3 = null;

        String calle, piso, garaje, nueva, nombre, dni, email, calleNueva, pisoNuevo, garejeNuevo, obraNueva, dniNuevo, emailNuevo, nombreNuevo, respuesta;

        int num, codigoPostal, numHabitaciones, numNuevo, codigoPostalNuevo, numHabitacionesNuevo, codigoElimanacion = 0;

        float precio, tamanio, precioNuevo, tamanioNuevo;

        long movil, movilNuevo;

        int opcion, codigoComprobacion = 0, opcionCambiarDatos, opcionCambiarDatosPropietario;

        boolean menu = false, salirMenuVivienda = false, salirMenuPropietario = false, comprobacionCodigo = false, registroVivienda1 = false, registroVivienda2 = false, registroVivienda3 = false;


        do {
            System.out.println("\n\t\t\tMenú de una Inmobiliaria");
            System.out.println("*************************************************");
            System.out.println("1. Registrar una nueva vivienda.");
            System.out.println("2. Mostrar las viviendas en una venta.");
            System.out.println("3. Editar una vivienda.");
            System.out.println("4. Eliminar una vivenda.");
            System.out.println("5. Salir");
            System.out.println("*************************************************");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    // Compruebo que esta los dos objetos esten a NULL
                    if (v1 == null && p1 == null) {
                        // Reservamos espacio en ram para la primera vivienda y el primer propietario.
                        v1 = new Vivienda();
                        p1 = new Propietario();

                        // Pedimos los datos
                        System.out.println("\n");
                        System.out.print("Introduce la calle: ");
                        calle = s.nextLine();
                        System.out.print("Introduce el numero: ");
                        num = Integer.parseInt(s.nextLine());
                        System.out.print("Introduce el codigo postal: ");
                        codigoPostal = Integer.parseInt(s.nextLine());
                        System.out.print("Introduce el piso: ");
                        piso = s.nextLine();
                        System.out.print("Introduce el tamaño: ");
                        tamanio = Float.parseFloat(s.nextLine());
                        System.out.print("¿Tiene garaje? (s o n): ");
                        garaje = s.nextLine();
                        System.out.print("Introduce el numero de habitaciones: ");
                        numHabitaciones = Integer.parseInt(s.nextLine());
                        System.out.print("Introduzca el precio: ");
                        precio = Float.parseFloat(s.nextLine());
                        System.out.print("¿Es nueva la vivienda? (s o n): ");
                        nueva = s.nextLine();

                        //Seteamos los datos de la Vivienda
                        v1.setCodigo(1);
                        v1.setCalle(calle);
                        v1.setNumero(num);
                        v1.setCodigoPostal(codigoPostal);
                        v1.setPiso(piso);
                        v1.setTamanio(tamanio);
                        if (garaje.equalsIgnoreCase("s")) {
                            v1.setConGarage(true);
                        } else if (garaje.equalsIgnoreCase("n")) {
                            v1.setConGarage(false);
                        }
                        v1.setNumHabitaciones(numHabitaciones);
                        v1.setPrecio(precio);
                        if (nueva.equalsIgnoreCase("s")) {
                            v1.setObraNueva(true);
                        } else if (garaje.equalsIgnoreCase("n")) {
                            v1.setObraNueva(false);
                        }
                        v1.setPropietario(p1);

                        // Pedimos los datos del propietario
                        System.out.println("\n");
                        System.out.println("Vamos a pedir los datos del propietario de la 1º Vivienda.");
                        System.out.print("Introduzca el dni: ");
                        dni = s.nextLine();
                        v1.getPropietario().setDni(dni);

                        System.out.print("Introduzca el nombre del propietario: ");
                        nombre = s.nextLine();
                        v1.getPropietario().setNombre(nombre);

                        System.out.print("Introduzca su número de telefono: ");
                        movil = Long.parseLong(s.nextLine());
                        v1.getPropietario().setMovil(movil);

                        System.out.print("Introduzca su email: ");
                        email = s.nextLine();
                        v1.getPropietario().setEmail(email);

                        registroVivienda1 = true;
                        Thread.sleep(1000);
                        System.out.println("Primera vivienda creada.");
                        System.out.println("Pulse alguna tecla para continuar...");
                        s.nextLine();
                        // Si la primera vivienda y el primer propietario no estan a NULL se pasa a la segunda vivienda
                    } else if (v2 == null && p2 == null) {
                        // Reservamos espacio en ram para la segunda vivienda y el segunda propietario.
                        v2 = new Vivienda();
                        p2 = new Propietario();

                        // Pedimos los datos
                        System.out.println("\n");
                        System.out.print("Introduce la calle: ");
                        calle = s.nextLine();
                        System.out.print("Introduce el numero: ");
                        num = Integer.parseInt(s.nextLine());
                        System.out.print("Introduce el codigo postal: ");
                        codigoPostal = Integer.parseInt(s.nextLine());
                        System.out.print("Introduce el piso: ");
                        piso = s.nextLine();
                        System.out.print("Introduce el tamaño: ");
                        tamanio = Float.parseFloat(s.nextLine());
                        System.out.print("¿Tiene garaje? (s o n): ");
                        garaje = s.nextLine();
                        System.out.print("Introduce el numero de habitaciones: ");
                        numHabitaciones = Integer.parseInt(s.nextLine());
                        System.out.print("Introduzca el precio: ");
                        precio = Float.parseFloat(s.nextLine());
                        System.out.print("¿Es nueva la vivienda? (s o n): ");
                        nueva = s.nextLine();

                        //Seteamos los datos de la Vivienda
                        v2.setCodigo(2);
                        v2.setCalle(calle);
                        v2.setNumero(num);
                        v2.setCodigoPostal(codigoPostal);
                        v2.setPiso(piso);
                        v2.setTamanio(tamanio);
                        if (garaje.equalsIgnoreCase("s")) {
                            v2.setConGarage(true);
                        } else if (garaje.equalsIgnoreCase("n")) {
                            v2.setConGarage(false);
                        }
                        v2.setNumHabitaciones(numHabitaciones);
                        v2.setPrecio(precio);
                        if (nueva.equalsIgnoreCase("s")) {
                            v2.setObraNueva(true);
                        } else if (garaje.equalsIgnoreCase("n")) {
                            v2.setObraNueva(false);
                        }
                        v2.setPropietario(p2);

                        // Pedimos los datos del propietario
                        System.out.println("\n");
                        System.out.println("Vamos a pedir los datos del propietario de la 2º Vivienda.");

                        System.out.print("Introduzca el dni: ");
                        dni = s.nextLine();
                        v2.getPropietario().setDni(dni);

                        System.out.print("Introduzca el nombre del propietario: ");
                        nombre = s.nextLine();
                        v2.getPropietario().setNombre(nombre);

                        System.out.print("Introduzca su número de telefono: ");
                        movil = Long.parseLong(s.nextLine());
                        v2.getPropietario().setMovil(movil);

                        System.out.print("Introduzca su email: ");
                        email = s.nextLine();
                        v2.getPropietario().setEmail(email);

                        registroVivienda2 = true;
                        Thread.sleep(1000);
                        System.out.println("Segunda vivienda creada.");
                        System.out.println("Pulse alguna tecla para continuar...");
                        s.nextLine();
                        // Si la primera vivienda, el primer propietario, la segunda vivienda y el segundo propietario no estan a NULL se pasa a la tercera vivienda
                    } else if (v3 == null && p3 == null) {
                        // Reservamos espacio en ram para la tercera vivienda y el tercer propietario.
                        v3 = new Vivienda();
                        p3 = new Propietario();

                        // Pedimos los datos
                        System.out.println("\n");
                        System.out.print("Introduce la calle: ");
                        calle = s.nextLine();
                        System.out.print("Introduce el numero: ");
                        num = Integer.parseInt(s.nextLine());
                        System.out.print("Introduce el codigo postal: ");
                        codigoPostal = Integer.parseInt(s.nextLine());
                        System.out.print("Introduce el piso: ");
                        piso = s.nextLine();
                        System.out.print("Introduce el tamaño: ");
                        tamanio = Float.parseFloat(s.nextLine());
                        System.out.print("¿Tiene garaje? (s o n): ");
                        garaje = s.nextLine();
                        System.out.print("Introduce el numero de habitaciones: ");
                        numHabitaciones = Integer.parseInt(s.nextLine());
                        System.out.print("Introduzca el precio: ");
                        precio = Float.parseFloat(s.nextLine());
                        System.out.print("¿Es nueva la vivienda? (s o n): ");
                        nueva = s.nextLine();

                        //Seteamos los datos de la Vivienda
                        v3.setCodigo(3);
                        v3.setCalle(calle);
                        v3.setNumero(num);
                        v3.setCodigoPostal(codigoPostal);
                        v3.setPiso(piso);
                        v3.setTamanio(tamanio);
                        if (garaje.equalsIgnoreCase("s")) {
                            v3.setConGarage(true);
                        } else if (garaje.equalsIgnoreCase("n")) {
                            v3.setConGarage(false);
                        }
                        v3.setNumHabitaciones(numHabitaciones);
                        v3.setPrecio(precio);
                        if (nueva.equalsIgnoreCase("s")) {
                            v3.setObraNueva(true);
                        } else if (garaje.equalsIgnoreCase("n")) {
                            v3.setObraNueva(false);
                        }
                        v3.setPropietario(p3);

                        // Pedimos los datos del propietario y los seteamos
                        System.out.println("\n");
                        System.out.println("Vamos a pedir los datos del propietario de la 3º Vivienda.");

                        System.out.print("Introduzca el dni: ");
                        dni = s.nextLine();
                        v3.getPropietario().setDni(dni);

                        System.out.print("Introduzca el nombre del propietario: ");
                        nombre = s.nextLine();
                        v3.getPropietario().setNombre(nombre);

                        System.out.print("Introduzca su número de telefono: ");
                        movil = Long.parseLong(s.nextLine());
                        v3.getPropietario().setMovil(movil);

                        System.out.print("Introduzca su email: ");
                        email = s.nextLine();
                        v3.getPropietario().setEmail(email);

                        registroVivienda3 = true;
                        Thread.sleep(1000);
                        System.out.println("Tercera vivienda creada.");
                        System.out.println("Pulse alguna tecla para continuar...");
                        s.nextLine();
                    }
                    // Comprobacion si los 3 registros no estan a NULL, cuando haga otro registro no va a poder porque maximo son 3.
                    System.out.println((registroVivienda1 && registroVivienda2 && registroVivienda3) ? "Maximo puedes registrar tres viviendas." : "");
                    break;
                case 2:
                    if ((v1 == null && p1 == null) && (v2 == null && p2 == null) && (v3 == null && p3 == null)) {
                        System.out.println("No puedes acceder a la opcion 2.");
                    } else {
                        // Hago esta comprobacion porque cuando hacia el primer registro mostraba los datos pero los demas salian a null porque estaba vacio
                        System.out.println((registroVivienda1) ? v1 : "");
                        System.out.println((registroVivienda2) ? v2 : "");
                        System.out.println((registroVivienda3) ? v3 : "");
                    }
                    System.out.println("Pulse alguna tecla para continuar...");
                    s.nextLine();
                    break;
                case 3:
                    if ((v1 == null && p1 == null) && (v2 == null && p2 == null) && (v3 == null && p3 == null)) {
                        System.out.println("No puedes acceder a la opcion 3.");
                        System.out.println("Pulse alguna tecla para continuar...");
                        s.nextLine();
                    } else {
                        while (!comprobacionCodigo) {
                            System.out.print("Introduzca el código de la vivienda: ");
                            codigoComprobacion = Integer.parseInt(s.nextLine());
                            if (codigoComprobacion < 0 || codigoComprobacion > 4)
                                System.out.println("Intentalo de nuevo.");
                            else comprobacionCodigo = true;
                        }
                        System.out.println("No puedes acceder a esta opcion, ya que no hay nada registrado.");
                        // Comprobacion de que no meta un numero negativo ni que sea mayor que 4.


                        if (codigoComprobacion == v1.getCodigo()) {

                            do {
                                System.out.println("****************************************");
                                System.out.println("1. Calle.");
                                System.out.println("2. Número.");
                                System.out.println("3. Código postal.");
                                System.out.println("4. Piso.");
                                System.out.println("5. Tamaño.");
                                System.out.println("6. ¿Tiene garaje?.");
                                System.out.println("7. Número de habitaciones.");
                                System.out.println("8. Precio.");
                                System.out.println("9. ¿Es obra nueva?.");
                                System.out.println("10. Datos del propietario.");
                                System.out.println("11. Volver");
                                System.out.println("****************************************");
                                System.out.print("¿Que datos quieres cambiar?: ");
                                opcionCambiarDatos = Integer.parseInt(s.nextLine());
                                switch (opcionCambiarDatos) {
                                    case 1:
                                        System.out.println("Calle actual: " + v1.getCalle());
                                        System.out.print("Introduzca la calle nueva: ");
                                        calleNueva = s.nextLine();
                                        v1.setCalle(calleNueva);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 2:
                                        System.out.println("Número actual: " + v1.getNumero());
                                        System.out.print("Introduzca el número nuevo: ");
                                        numNuevo = Integer.parseInt(s.nextLine());
                                        v1.setNumero(numNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 3:
                                        System.out.println("Código Postal actual: " + v1.getCodigoPostal());
                                        System.out.print("Introduzca el codigo postal nuevo: ");
                                        codigoPostalNuevo = Integer.parseInt(s.nextLine());
                                        v1.setCodigoPostal(codigoPostalNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 4:
                                        System.out.println("Piso actual: " + v1.getPiso());
                                        System.out.print("Introduzca el piso nuevo: ");
                                        pisoNuevo = s.nextLine();
                                        v1.setPiso(pisoNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 5:
                                        System.out.println("Tamaño actual: " + v1.getTamanio() + " m2");
                                        System.out.print("Introduzca el tamaño nuevo: ");
                                        tamanioNuevo = Float.parseFloat(s.nextLine());
                                        v1.setTamanio(tamanioNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 6:
                                        System.out.println("Garaje actual: " + v1.isConGarage());
                                        System.out.print("Introduzca el garaje nuevo: ");
                                        garejeNuevo = s.nextLine();
                                        if (garejeNuevo.equalsIgnoreCase("s")) {
                                            v1.setConGarage(true);
                                        } else if (garejeNuevo.equalsIgnoreCase("n")) {
                                            v1.setConGarage(false);
                                        }
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 7:
                                        System.out.println("Número de habitaciones actual: " + v1.getNumHabitaciones());
                                        System.out.print("Introduzca el numero de habitaciones nuevo: ");
                                        numHabitacionesNuevo = Integer.parseInt(s.nextLine());
                                        v1.setNumHabitaciones(numHabitacionesNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 8:
                                        System.out.println("Precio actual: " + v1.getPrecio());
                                        System.out.print("Introduzca el precio nuevo: ");
                                        precioNuevo = Float.parseFloat(s.nextLine());
                                        v1.setPrecio(precioNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 9:
                                        System.out.println("¿Es nueva? actual: " + v1.isObraNueva());
                                        System.out.print("Introduzca si es una obra nueva: ");
                                        obraNueva = s.nextLine();
                                        if (obraNueva.equalsIgnoreCase("s")) {
                                            v1.setObraNueva(true);
                                        } else if (obraNueva.equalsIgnoreCase("n")) {
                                            v1.setObraNueva(false);
                                        }
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 10:
                                        do {
                                            System.out.println("***********************************");
                                            System.out.println("1. Dni.");
                                            System.out.println("2. Nombre.");
                                            System.out.println("3. Telefono.");
                                            System.out.println("4. Email.");
                                            System.out.println("5. Volver");
                                            System.out.println("***********************************");
                                            System.out.print("Introduzca el dato que quieres cambiar del propietario: ");
                                            opcionCambiarDatosPropietario = Integer.parseInt(s.nextLine());
                                            switch (opcionCambiarDatosPropietario) {
                                                case 1:
                                                    System.out.println("Dni actual: " + p1.getDni());
                                                    System.out.print("Introduzca el dni nuevo: ");
                                                    dniNuevo = s.nextLine();
                                                    v1.getPropietario().setDni(dniNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 2:
                                                    System.out.println("Nombre actual: " + p1.getNombre());
                                                    System.out.print("Introduzca el nuevo nombre: ");
                                                    nombreNuevo = s.nextLine();
                                                    v1.getPropietario().setNombre(nombreNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 3:
                                                    System.out.println("Telefono actual: " + p1.getMovil());
                                                    System.out.print("Introduzca el telefono nuevo: ");
                                                    movilNuevo = Long.parseLong(s.nextLine());
                                                    v1.getPropietario().setMovil(movilNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 4:
                                                    System.out.println("Email actual: " + p1.getEmail());
                                                    System.out.print("Introduzca el email nuevo: ");
                                                    emailNuevo = s.nextLine();
                                                    v1.getPropietario().setEmail(emailNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 5:
                                                    salirMenuPropietario = true;
                                                    break;
                                            }
                                        } while (!salirMenuPropietario);
                                        break;
                                    case 11:
                                        salirMenuVivienda = true;
                                        break;
                                }
                            } while (!salirMenuVivienda);
                        } else if (codigoComprobacion == v2.getCodigo()) {
                            do {
                                System.out.println("****************************************");
                                System.out.println("1. Calle.");
                                System.out.println("2. Número.");
                                System.out.println("3. Código postal.");
                                System.out.println("4. Piso.");
                                System.out.println("5. Tamaño.");
                                System.out.println("6. ¿Tiene garaje?.");
                                System.out.println("7. Número de habitaciones.");
                                System.out.println("8. Precio.");
                                System.out.println("9. ¿Es obra nueva?.");
                                System.out.println("10. Datos del propietario.");
                                System.out.println("11. Volver");
                                System.out.println("****************************************");
                                System.out.print("¿Que datos quieres cambiar?: ");
                                opcionCambiarDatos = Integer.parseInt(s.nextLine());
                                switch (opcionCambiarDatos) {
                                    case 1:
                                        System.out.println("Calle actual: " + v2.getCalle());
                                        System.out.print("Introduzca la calle nueva: ");
                                        calleNueva = s.nextLine();
                                        v2.setCalle(calleNueva);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 2:
                                        System.out.println("Número actual: " + v2.getNumero());
                                        System.out.print("Introduzca el número nuevo: ");
                                        numNuevo = Integer.parseInt(s.nextLine());
                                        v2.setNumero(numNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 3:
                                        System.out.println("Código Postal actual: " + v2.getCodigoPostal());
                                        System.out.print("Introduzca el codigo postal nuevo: ");
                                        codigoPostalNuevo = Integer.parseInt(s.nextLine());
                                        v2.setCodigoPostal(codigoPostalNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 4:
                                        System.out.println("Piso actual: " + v2.getPiso());
                                        System.out.print("Introduzca el piso nuevo: ");
                                        pisoNuevo = s.nextLine();
                                        v2.setPiso(pisoNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 5:
                                        System.out.println("Tamaño actual: " + v2.getTamanio() + " m2");
                                        System.out.print("Introduzca el tamaño nuevo: ");
                                        tamanioNuevo = Float.parseFloat(s.nextLine());
                                        v2.setTamanio(tamanioNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 6:
                                        System.out.println("Garaje actual: " + v2.isConGarage());
                                        System.out.print("Introduzca el garaje nuevo: ");
                                        garejeNuevo = s.nextLine();
                                        if (garejeNuevo.equalsIgnoreCase("s")) {
                                            v2.setConGarage(true);
                                        } else if (garejeNuevo.equalsIgnoreCase("n")) {
                                            v2.setConGarage(false);
                                        }
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 7:
                                        System.out.println("Número de habitaciones actual: " + v2.getNumHabitaciones());
                                        System.out.print("Introduzca el numero de habitaciones nuevo: ");
                                        numHabitacionesNuevo = Integer.parseInt(s.nextLine());
                                        v2.setNumHabitaciones(numHabitacionesNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 8:
                                        System.out.println("Precio actual: " + v2.getPrecio());
                                        System.out.print("Introduzca el precio nuevo: ");
                                        precioNuevo = Float.parseFloat(s.nextLine());
                                        v2.setPrecio(precioNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 9:
                                        System.out.println("¿Es nueva? actual: " + v2.isObraNueva());
                                        System.out.print("Introduzca si es una obra nueva: ");
                                        obraNueva = s.nextLine();
                                        if (obraNueva.equalsIgnoreCase("s")) {
                                            v2.setObraNueva(true);
                                        } else if (obraNueva.equalsIgnoreCase("n")) {
                                            v2.setObraNueva(false);
                                        }
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 10:
                                        do {
                                            System.out.println("***********************************");
                                            System.out.println("1. Dni.");
                                            System.out.println("2. Nombre.");
                                            System.out.println("3. Telefono.");
                                            System.out.println("4. Email.");
                                            System.out.println("5. Volver");
                                            System.out.println("***********************************");
                                            System.out.print("Introduzca el dato que quieres cambiar del propietario: ");
                                            opcionCambiarDatosPropietario = Integer.parseInt(s.nextLine());
                                            switch (opcionCambiarDatosPropietario) {
                                                case 1:
                                                    System.out.println("Dni actual: " + p2.getDni());
                                                    System.out.print("Introduzca el dni nuevo: ");
                                                    dniNuevo = s.nextLine();
                                                    v2.getPropietario().setDni(dniNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 2:
                                                    System.out.println("Nombre actual: " + p2.getNombre());
                                                    System.out.print("Introduzca el nuevo nombre: ");
                                                    nombreNuevo = s.nextLine();
                                                    v2.getPropietario().setNombre(nombreNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 3:
                                                    System.out.println("Telefono actual: " + p2.getMovil());
                                                    System.out.print("Introduzca el telefono nuevo: ");
                                                    movilNuevo = Long.parseLong(s.nextLine());
                                                    v2.getPropietario().setMovil(movilNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 4:
                                                    System.out.println("Email actual: " + p2.getEmail());
                                                    System.out.print("Introduzca el email nuevo: ");
                                                    emailNuevo = s.nextLine();
                                                    v2.getPropietario().setEmail(emailNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 5:
                                                    salirMenuPropietario = true;
                                                    break;
                                            }
                                        } while (!salirMenuPropietario);
                                        break;
                                    case 11:
                                        salirMenuVivienda = true;
                                        break;
                                }
                            } while (!salirMenuVivienda);
                        } else if (codigoComprobacion == v3.getCodigo()) {
                            do {
                                System.out.println("****************************************");
                                System.out.println("1. Calle.");
                                System.out.println("2. Número.");
                                System.out.println("3. Código postal.");
                                System.out.println("4. Piso.");
                                System.out.println("5. Tamaño.");
                                System.out.println("6. ¿Tiene garaje?.");
                                System.out.println("7. Número de habitaciones.");
                                System.out.println("8. Precio.");
                                System.out.println("9. ¿Es obra nueva?.");
                                System.out.println("10. Datos del propietario.");
                                System.out.println("11. Volver");
                                System.out.println("****************************************");
                                System.out.print("¿Que datos quieres cambiar?: ");
                                opcionCambiarDatos = Integer.parseInt(s.nextLine());
                                switch (opcionCambiarDatos) {
                                    case 1:
                                        System.out.println("Calle actual: " + v3.getCalle());
                                        System.out.print("Introduzca la calle nueva: ");
                                        calleNueva = s.nextLine();
                                        v3.setCalle(calleNueva);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 2:
                                        System.out.println("Número actual: " + v3.getNumero());
                                        System.out.print("Introduzca el número nuevo: ");
                                        numNuevo = Integer.parseInt(s.nextLine());
                                        v3.setNumero(numNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 3:
                                        System.out.println("Código Postal actual: " + v3.getCodigoPostal());
                                        System.out.print("Introduzca el codigo postal nuevo: ");
                                        codigoPostalNuevo = Integer.parseInt(s.nextLine());
                                        v3.setCodigoPostal(codigoPostalNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 4:
                                        System.out.println("Piso actual: " + v3.getPiso());
                                        System.out.print("Introduzca el piso nuevo: ");
                                        pisoNuevo = s.nextLine();
                                        v3.setPiso(pisoNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 5:
                                        System.out.println("Tamaño actual: " + v3.getTamanio() + " m2");
                                        System.out.print("Introduzca el tamaño nuevo: ");
                                        tamanioNuevo = Float.parseFloat(s.nextLine());
                                        v3.setTamanio(tamanioNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 6:
                                        System.out.println("Garaje actual: " + v3.isConGarage());
                                        System.out.print("Introduzca el garaje nuevo: ");
                                        garejeNuevo = s.nextLine();
                                        if (garejeNuevo.equalsIgnoreCase("s")) {
                                            v3.setConGarage(true);
                                        } else if (garejeNuevo.equalsIgnoreCase("n")) {
                                            v3.setConGarage(false);
                                        }
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 7:
                                        System.out.println("Número de habitaciones actual: " + v3.getNumHabitaciones());
                                        System.out.print("Introduzca el numero de habitaciones nuevo: ");
                                        numHabitacionesNuevo = Integer.parseInt(s.nextLine());
                                        v3.setNumHabitaciones(numHabitacionesNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 8:
                                        System.out.println("Precio actual: " + v3.getPrecio());
                                        System.out.print("Introduzca el precio nuevo: ");
                                        precioNuevo = Float.parseFloat(s.nextLine());
                                        v3.setPrecio(precioNuevo);
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 9:
                                        System.out.println("¿Es nueva? actual: " + v3.isObraNueva());
                                        System.out.print("Introduzca si es una obra nueva: ");
                                        obraNueva = s.nextLine();
                                        if (obraNueva.equalsIgnoreCase("s")) {
                                            v3.setObraNueva(true);
                                        } else if (obraNueva.equalsIgnoreCase("n")) {
                                            v3.setObraNueva(false);
                                        }
                                        System.out.println("Pulse alguna tecla para continuar...");
                                        s.nextLine();
                                        break;
                                    case 10:
                                        do {
                                            System.out.println("***********************************");
                                            System.out.println("1. Dni.");
                                            System.out.println("2. Nombre.");
                                            System.out.println("3. Telefono.");
                                            System.out.println("4. Email.");
                                            System.out.println("5. Volver");
                                            System.out.println("***********************************");
                                            System.out.print("Introduzca el dato que quieres cambiar del propietario: ");
                                            opcionCambiarDatosPropietario = Integer.parseInt(s.nextLine());
                                            switch (opcionCambiarDatosPropietario) {
                                                case 1:
                                                    System.out.println("Dni actual: " + p3.getDni());
                                                    System.out.print("Introduzca el dni nuevo: ");
                                                    dniNuevo = s.nextLine();
                                                    v3.getPropietario().setDni(dniNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 2:
                                                    System.out.println("Nombre actual: " + p3.getNombre());
                                                    System.out.print("Introduzca el nuevo nombre: ");
                                                    nombreNuevo = s.nextLine();
                                                    v3.getPropietario().setNombre(nombreNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 3:
                                                    System.out.println("Telefono actual: " + p3.getMovil());
                                                    System.out.print("Introduzca el telefono nuevo: ");
                                                    movilNuevo = Long.parseLong(s.nextLine());
                                                    v3.getPropietario().setMovil(movilNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 4:
                                                    System.out.println("Email actual: " + p3.getEmail());
                                                    System.out.print("Introduzca el email nuevo: ");
                                                    emailNuevo = s.nextLine();
                                                    v3.getPropietario().setEmail(emailNuevo);
                                                    System.out.println("Pulse alguna tecla para continuar...");
                                                    s.nextLine();
                                                    break;
                                                case 5:
                                                    salirMenuPropietario = true;
                                                    break;
                                            }
                                        } while (!salirMenuPropietario);
                                        break;
                                    case 11:
                                        salirMenuVivienda = true;
                                        break;
                                }
                            } while (!salirMenuVivienda);
                        }
                    }
                    break;
                case 4:
                    if ((v1 == null && p1 == null) && (v2 == null && p2 == null) && (v3 == null && p3 == null)) {
                        System.out.println("No puedes acceder a la opcion 4.");
                        System.out.println("Pulse alguna tecla para continuar...");
                        s.nextLine();
                    } else {
                        // Comprobacion de que no meta un numero negativo ni que sea mayor que 4.
                        while (!comprobacionCodigo) {
                            System.out.print("Introduzca el código de la vivienda que quieres eleminar: ");
                            codigoElimanacion = Integer.parseInt(s.nextLine());
                            if (codigoElimanacion < 0 || codigoElimanacion > 4)
                                System.out.println("Intentalo de nuevo.");
                            else comprobacionCodigo = true;
                        }

                        if (codigoElimanacion == v1.getCodigo()) {
                            System.out.println(v1);
                            System.out.print("Seguro que lo quieres eleminar (s): ");
                            respuesta = s.nextLine();
                            if (respuesta.equalsIgnoreCase("s")) {
                                v1 = null;
                                p1 = null;
                            }
                            System.out.println("Elimando.....");
                            Thread.sleep(2000);
                            System.out.println("Pulse alguna tecla para continuar...");
                            s.nextLine();
                        } else if (codigoElimanacion == v2.getCodigo()) {
                            System.out.println(v2);
                            System.out.print("Seguro que lo quieres eleminar (s): ");
                            respuesta = s.nextLine();
                            if (respuesta.equalsIgnoreCase("s")) {
                                v2 = null;
                                p2 = null;
                            }
                            System.out.println("Elimando.....");
                            Thread.sleep(2000);
                            System.out.println("Pulse alguna tecla para continuar...");
                            s.nextLine();
                        } else if (codigoElimanacion == v3.getCodigo()) {
                            System.out.println(v3);
                            System.out.print("Seguro que lo quieres eleminar (s): ");
                            respuesta = s.nextLine();
                            if (respuesta.equalsIgnoreCase("s")) {
                                v3 = null;
                                p3 = null;
                            }
                            System.out.println("Elimando....");
                            Thread.sleep(2000);
                            System.out.println("Pulse alguna tecla para continuar...");
                            s.nextLine();
                        }
                    }
                    break;
                case 5:
                    menu = true;
                    break;
            }
        }
        while (!menu);
    }
}
