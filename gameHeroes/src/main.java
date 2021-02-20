import Modelo.Batalla;
import Modelo.Complementos;
import Modelo.Heroe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int opcionMenuJuego, opcionPersonajes, opcionComplementos, opcionPersonajeCompleto, opcionMenuHeroe;
        boolean menuJuego = false, menuComplementosHeroe = false;

        String aparenciaCarlos =
                "\n" +
                        "        ||||" +
                        "\n" +
                        "      |      |\n" +
                        "     @  O  O  @\n" +
                        "      |  ~   |         \\__\n" +
                        "       \\ -- /          |\\ |\n" +
                        "     ___|  |___        | \\|\n" +
                        "    /          \\      /|__|\n" +
                        "   /            \\    / /\n" +
                        "  /  /| .  . |\\  \\  / /\n" +
                        " /  / |      | \\  \\/ /\n" +
                        "<  <  |      |  \\   /\n" +
                        " \\  \\ |  .   |   \\_/\n" +
                        "  \\  \\|______|\n" +
                        "    \\_|______|\n" +
                        "      |      |\n" +
                        "      |  |   |\n" +
                        "      |  |   |\n" +
                        "      |__|___|\n" +
                        "      |  |  |\n" +
                        "      (  (  |\n" +
                        "      |  |  |\n" +
                        "      |  |  |\n" +
                        "     _|  |  |\n" +
                        " cccC_Cccc___)";

        String aparenciaAntonio =
                "       .-\"\"-.\n" +
                        "      /-.{}  \\\n" +
                        "      | _\\__.|\n" +
                        "      \\/^)^ \\/\n" +
                        "       \\ =  /\n" +
                        "  .---./`--`\\.--._\n" +
                        " /     `;--'`     \\\n" +
                        ";        /`       ;\n" +
                        "|       |*        |\n" +
                        "/   |   |     |    \\\n" +
                        "|    \\  |*    /    |\n" +
                        "\\_   |\\_|____/|  __/\n" +
                        "  \\__//======\\\\__/\n" +
                        "  / //_      _\\\\ \\\n" +
                        "  -'  |`\"\"\"\"`|  `-\n" +
                        "      |  L   |\n" +
                        "      >_ || _<\n" +
                        "      |  ||  |\n" +
                        "      |  ||  |\n" +
                        "     /   ||   \\\n" +
                        "    /    /,    \\\n" +
                        "     `|\"|`\"|\"|\"`\n" +
                        "     /  )  /  ) \n" +
                        "    /__/  /__/";

        String aparenciaLoli =
                "\n" +
                        "         \\\".\".\"/\n" +
                        "          //`\\\\\n" +
                        "         (/a a\\)\n" +
                        "         (\\_-_/) \n" +
                        "        .-~'='~-.\n" +
                        "       /`~`\"Y\"`~`\\\n" +
                        "      / /(_ * _)\\ \\\n" +
                        "     / /  )   (  \\ \\\n" +
                        "     \\ \\_/\\\\_//\\_/ / \n" +
                        "      \\/_) '*' (_\\/\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        |       |\n" +
                        "        w*W*W*W*w";

        String aparenciaPatri =
                "\n" +
                        "            ((|)))))\n" +
                        "            ((/ a a\n" +
                        "            )))   >)\n" +
                        "           ((((._e((\n" +
                        "          ,--/ (-.\n" +
                        "         / \\ <\\/>/|\n" +
                        "        / /)  Lo )|\n" +
                        "       / / )    / |\n" +
                        "      |   /    ( /\n" +
                        "      |  /     ;/\n" +
                        "      ||(      | \n" +
                        "     / )|/|    \\ \n" +
                        "    |/'/\\ \\_____\\\n" +
                        "         \\   |  \\\n" +
                        "          \\  |\\  \\\n" +
                        "          |  | )  )\n" +
                        "          )  )/  /\n" +
                        "         /  /   /\n" +
                        "        /   |  /\n" +
                        "       /    | /\n" +
                        "      /     ||\n" +
                        "     /      ||\n" +
                        "      '-,_  |_\\\n" +
                        "        ( '\"'-`\n" +
                        "       \\(\\_\\";

        Heroe carlos = new Heroe("Carlos", 12, 14, 20, 100, aparenciaCarlos);

        Heroe loli = new Heroe("Loli", 12, 14, 20, 100, aparenciaLoli);

        Heroe patri = new Heroe("Patricia", 12, 14, 20, 100, aparenciaPatri);

        Heroe antonio = new Heroe("Antonio", 12, 14, 20, 100, aparenciaAntonio);


        Complementos complemento1Carlos = new Complementos("Mac", 10, 20, 0, 5);
        Complementos complemento2Carlos = new Complementos("Mochila", 25, 0, 0, 15);
        Complementos complemento3Carlos = new Complementos("Plumon Rojo", 0, 10, 30, 20);
        Complementos complemento4Carlos = new Complementos("Preguntas TEST", 40, 0, 0, 10);

        Complementos complemento1Loli = new Complementos("MYSQL", 30, 0, 0, 15);
        Complementos complemento2Loli = new Complementos("Ejercicios A PUNTA PALA", 30, 0, 40, 0);
        Complementos complemento3Loli = new Complementos("Tacones", 0, 20, 0, 10);

        Complementos complemento1Antonio = new Complementos("Churros", 0, 0, 20, 10);
        Complementos complemento2Antonio = new Complementos("Palmadita Espalda", 30, 10, 0, 0);
        Complementos complemento3Antonio = new Complementos("HTML a Papel", 40, 0, 15, 10);


        Complementos complemento1Patri = new Complementos("Guapura", 0, 0, 30, 20);
        Complementos complemento2Patri = new Complementos("Maquinas Virtuales", 15, 10, 0, 2);


        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tFIGHTING GAME I.E.S SAN FERNANDO III");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------------------------------");


        do {
            System.out.println();
            System.out.println("\t\t\tMENU DEL JUEGO");
            System.out.println("******************************************");
            System.out.println("1. Ver Personajes y Complementos que hay.");
            System.out.println("2. Ver tu Personaje Completo.");
            System.out.println("3. Empenzar Combate.");
            System.out.println("4. Cerrar Juego");
            System.out.println("******************************************");
            System.out.print("Introduce una opcion: ");
            opcionMenuJuego = Integer.parseInt(s.nextLine());

            switch (opcionMenuJuego) {
                case 1:
                    System.out.println();
                    System.out.println("\tPERSONAJES DISPONIBLES");
                    System.out.println("================================");
                    System.out.println("1. Carlos.");
                    System.out.println("2. Loli.");
                    System.out.println("3. Patricia.");
                    System.out.println("4. Antonio.");
                    System.out.println("5. Volver atras");
                    System.out.println("================================");
                    System.out.print("Elige un personaje: ");
                    opcionPersonajes = Integer.parseInt(s.nextLine());

                    switch (opcionPersonajes) {
                        case 1:
                            System.out.println();
                            System.out.println(carlos);
                            System.out.println();

                            do {
                                System.out.println("\tMENU DEL PERSONAJE");
                                System.out.println("*********************************");
                                System.out.println("1. Añadir Complemento.");
                                System.out.println("2. Desequipar Complemento.");
                                System.out.println("3. Volver");
                                System.out.println("*********************************");
                                System.out.print("Introduce una opcion: ");
                                opcionMenuHeroe = Integer.parseInt(s.nextLine());

                                switch (opcionMenuHeroe) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Ahora vamos a elegir un complemento para tu personaje " + carlos.getNombre() + ".");
                                        System.out.println();

                                        System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                        System.out.println("------------------------------");
                                        System.out.println("1. Mac.");
                                        System.out.println("2. Mochila.");
                                        System.out.println("3. Plumon Rojo.");
                                        System.out.println("4. Tipo Test.");
                                        System.out.println("------------------------------");
                                        System.out.print("Elige un complemento: ");
                                        opcionComplementos = Integer.parseInt(s.nextLine());
                                        switch (opcionComplementos) {
                                            case 1:
                                                System.out.println();
                                                System.out.println(complemento1Carlos);
                                                carlos.equiparComplemento(complemento1Carlos);
                                                System.out.println();
                                                break;
                                            case 2:
                                                System.out.println();
                                                System.out.println(complemento2Carlos);
                                                carlos.equiparComplemento(complemento2Carlos);
                                                System.out.println();
                                                break;
                                            case 3:
                                                System.out.println();
                                                System.out.println(complemento3Carlos);
                                                carlos.equiparComplemento(complemento3Carlos);
                                                System.out.println();
                                                break;
                                            case 4:
                                                System.out.println();
                                                System.out.println(complemento4Carlos);
                                                carlos.equiparComplemento(complemento4Carlos);
                                                System.out.println();
                                        }// Switch Menu complementos
                                        break;
                                    case 2:
                                        if (carlos.getComplementos() == null)
                                            System.out.println("Todavia " + carlos.getNombre() + " no se ha equipado nada.");
                                        else {
                                            System.out.println();
                                            System.out.println("No te ha servido de mucho, el complemento " + carlos.getComplementos().getNombre() + " para el personaje " + carlos.getNombre() + ".");
                                            System.out.println();

                                            System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                            System.out.println("------------------------------");
                                            System.out.println("1. Mac.");
                                            System.out.println("2. Mochila.");
                                            System.out.println("3. Plumon Rojo.");
                                            System.out.println("4. Tipo Test.");
                                            System.out.println("------------------------------");
                                            System.out.print("¿Que complemento quieres desequipar?: ");
                                            opcionComplementos = Integer.parseInt(s.nextLine());
                                            switch (opcionComplementos) {
                                                case 1:
                                                    System.out.println();
                                                    carlos.desiquiparComplemento();
                                                case 2, 3, 4:
                                            }// Switch Menu Complementos para Desiquipar
                                        }
                                        System.out.println();
                                        break;
                                    case 3:
                                        menuComplementosHeroe = true;
                                }// Switch menu Heroe
                            } while (!menuComplementosHeroe);
                            break;
                        case 2:
                            System.out.println();
                            System.out.println(loli);
                            System.out.println();

                            do {
                                System.out.println("\tMENU DEL PERSONAJE");
                                System.out.println("*********************************");
                                System.out.println("1. Añadir Complemento.");
                                System.out.println("2. Desequipar Complemento.");
                                System.out.println("3. Volver");
                                System.out.println("*********************************");
                                System.out.print("Introduce una opcion: ");
                                opcionMenuHeroe = Integer.parseInt(s.nextLine());

                                switch (opcionMenuHeroe) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Ahora vamos a elegir un complemento para tu personaje " + loli.getNombre() + ".");
                                        System.out.println();
                                        System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                        System.out.println("------------------------------");
                                        System.out.println("1. MySql.");
                                        System.out.println("2. Ejercicios a punta pala.");
                                        System.out.println("3. Tacones.");
                                        System.out.println("------------------------------");
                                        System.out.print("Elige un complemento: ");
                                        opcionComplementos = Integer.parseInt(s.nextLine());
                                        switch (opcionComplementos) {
                                            case 1:
                                                System.out.println();
                                                System.out.println(complemento1Loli);
                                                loli.equiparComplemento(complemento1Loli);
                                                System.out.println();
                                                break;
                                            case 2:
                                                System.out.println();
                                                System.out.println(complemento2Loli);
                                                loli.equiparComplemento(complemento2Loli);
                                                System.out.println();
                                                break;
                                            case 3:
                                                System.out.println();
                                                System.out.println(complemento3Loli);
                                                loli.equiparComplemento(complemento3Loli);
                                                System.out.println();
                                        }// Switch Menu complementos
                                        break;
                                    case 2:
                                        if (loli.getComplementos() == null)
                                            System.out.println("Todavia " + loli.getNombre() + " no se ha equipado nada.");
                                        else {
                                            System.out.println();
                                            System.out.println("No te ha servido de mucho, el complemento " + loli.getComplementos().getNombre() + " para el personaje " + loli.getNombre() + ".");
                                            System.out.println();

                                            System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                            System.out.println("------------------------------");
                                            System.out.println("1. MySql.");
                                            System.out.println("2. Ejercicios a punta pala.");
                                            System.out.println("3. Tacones.");
                                            System.out.println("------------------------------");
                                            System.out.print("¿Que complemento quieres desequipar?: ");
                                            opcionComplementos = Integer.parseInt(s.nextLine());
                                            switch (opcionComplementos) {
                                                case 1:
                                                    System.out.println();
                                                    loli.desiquiparComplemento();
                                                case 2, 3:
                                            }// Switch Menu Complementos para Desiquipar
                                        }
                                        System.out.println();
                                        break;
                                    case 3:
                                        menuComplementosHeroe = true;
                                }// Switch menu Heroe
                            } while (!menuComplementosHeroe);
                            break;
                        case 3:
                            System.out.println();
                            System.out.println(patri);
                            System.out.println();

                            do {
                                System.out.println("\tMENU DEL PERSONAJE");
                                System.out.println("*********************************");
                                System.out.println("1. Añadir Complemento.");
                                System.out.println("2. Desequipar Complemento.");
                                System.out.println("3. Volver");
                                System.out.println("*********************************");
                                System.out.print("Introduce una opcion: ");
                                opcionMenuHeroe = Integer.parseInt(s.nextLine());

                                switch (opcionMenuHeroe) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Ahora vamos a elegir un complemento para tu personaje " + patri.getNombre() + ".");
                                        System.out.println();
                                        System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                        System.out.println("------------------------------");
                                        System.out.println("1. Guapura.");
                                        System.out.println("2. Maquina Virtuales.");
                                        System.out.println("------------------------------");
                                        System.out.print("Elige un complemento: ");
                                        opcionComplementos = Integer.parseInt(s.nextLine());
                                        switch (opcionComplementos) {
                                            case 1:
                                                System.out.println();
                                                System.out.println(complemento1Patri);
                                                patri.equiparComplemento(complemento1Patri);
                                                System.out.println();
                                                break;
                                            case 2:
                                                System.out.println();
                                                System.out.println(complemento2Patri);
                                                patri.equiparComplemento(complemento2Patri);
                                                System.out.println();
                                                break;
                                        }// Switch Menu complementos
                                        break;
                                    case 2:
                                        if (patri.getComplementos() == null)
                                            System.out.println("Todavia " + patri.getNombre() + " no se ha equipado nada.");
                                        else {
                                            System.out.println();
                                            System.out.println("No te ha servido de mucho, el complemento " + patri.getComplementos().getNombre() + " para el personaje " + patri.getNombre() + ".");
                                            System.out.println();

                                            System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                            System.out.println("------------------------------");
                                            System.out.println("1. Guapura.");
                                            System.out.println("2. Maquina Virtuales.");
                                            System.out.println("------------------------------");
                                            System.out.print("¿Que complemento quieres desequipar?: ");
                                            opcionComplementos = Integer.parseInt(s.nextLine());
                                            switch (opcionComplementos) {
                                                case 1:
                                                    System.out.println();
                                                    patri.desiquiparComplemento();
                                                case 2:
                                            }// Switch Menu Complementos para Desiquipar
                                        }
                                        System.out.println();
                                        break;
                                    case 3:
                                        menuComplementosHeroe = true;
                                }// Switch menu Heroe
                            } while (!menuComplementosHeroe);
                            break;
                        case 4:
                            System.out.println();
                            System.out.println(antonio);
                            System.out.println();

                            do {
                                System.out.println("\t\tMENU DEL PERSONAJE");
                                System.out.println("*********************************");
                                System.out.println("1. Añadir Complemento.");
                                System.out.println("2. Desequipar Complemento.");
                                System.out.println("3. Volver");
                                System.out.println("*********************************");
                                System.out.print("Introduce una opcion: ");
                                opcionMenuHeroe = Integer.parseInt(s.nextLine());

                                switch (opcionMenuHeroe) {
                                    case 1:
                                        System.out.println();
                                        System.out.println("Ahora vamos a elegir un complemento para tu personaje " + antonio.getNombre() + ".");
                                        System.out.println();
                                        System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                        System.out.println("------------------------------");
                                        System.out.println("1. Churros.");
                                        System.out.println("2. Palmadita Espalda.");
                                        System.out.println("3. HTML a papel.");
                                        System.out.println("------------------------------");
                                        System.out.print("Elige un complemento: ");
                                        opcionComplementos = Integer.parseInt(s.nextLine());
                                        switch (opcionComplementos) {
                                            case 1:
                                                System.out.println();
                                                System.out.println(complemento1Antonio);
                                                antonio.equiparComplemento(complemento1Antonio);
                                                System.out.println();
                                                break;
                                            case 2:
                                                System.out.println();
                                                System.out.println(complemento2Antonio);
                                                antonio.equiparComplemento(complemento2Antonio);
                                                System.out.println();
                                                break;
                                            case 3:
                                                System.out.println();
                                                System.out.println(complemento3Antonio);
                                                antonio.equiparComplemento(complemento3Antonio);
                                                System.out.println();
                                        }// Switch Menu complementos
                                        break;
                                    case 2:
                                        if (antonio.getComplementos() == null)
                                            System.out.println("Todavia " + antonio.getNombre() + " no se ha equipado nada.");
                                        else {
                                            System.out.println();
                                            System.out.println("No te ha servido de mucho, el complemento " + antonio.getComplementos().getNombre() + " para el personaje " + antonio.getNombre() + ".");
                                            System.out.println();

                                            System.out.println("\tCOMPLEMENTOS DISPONIBLES");
                                            System.out.println("------------------------------");
                                            System.out.println("1. Churros.");
                                            System.out.println("2. Palmadita Espalda.");
                                            System.out.println("3. HTML a papel.");
                                            System.out.println("------------------------------");
                                            System.out.print("¿Que complemento quieres desequipar?: ");
                                            opcionComplementos = Integer.parseInt(s.nextLine());
                                            switch (opcionComplementos) {
                                                case 1:
                                                    System.out.println();
                                                    antonio.desiquiparComplemento();
                                                case 2, 3:
                                            }// Switch Menu Complementos para Desiquipar
                                        }
                                        System.out.println();
                                        break;
                                    case 3:
                                        menuComplementosHeroe = true;
                                }// Switch menu Heroe
                            } while (!menuComplementosHeroe);
                            break;
                        case 5:
                            menuJuego = false;
                    }// Switch Menu Personajes
                    break;
                case 2:
                    System.out.println();
                    System.out.println("\tPERSONAJES DISPONIBLES");
                    System.out.println("================================");
                    System.out.println("1. Carlos.");
                    System.out.println("2. Loli.");
                    System.out.println("3. Patricia.");
                    System.out.println("4. Antonio.");
                    System.out.println("================================");
                    System.out.print("¿Que personaje has elegido?: ");
                    opcionPersonajeCompleto = Integer.parseInt(s.nextLine());
                    switch (opcionPersonajeCompleto) {
                        case 1:
                            if (carlos.getComplementos() != null) {
                                carlos.devuelveDefensaTotal();
                                carlos.devuelveVelocidadTotal();
                                carlos.devuelveVidaTotal();
                                carlos.devuelveAtaqueTotal();
                            }
                            System.out.println(carlos);
                            break;
                        case 2:
                            if (loli.getComplementos() != null) {
                                loli.devuelveDefensaTotal();
                                loli.devuelveVelocidadTotal();
                                loli.devuelveVidaTotal();
                                loli.devuelveAtaqueTotal();
                            }
                            System.out.println(loli);
                            break;
                        case 3:
                            if (patri.getComplementos() != null) {
                                patri.devuelveDefensaTotal();
                                patri.devuelveVelocidadTotal();
                                patri.devuelveVidaTotal();
                                patri.devuelveAtaqueTotal();
                            }
                            System.out.println(patri);
                            break;
                        case 4:
                            if (antonio.getComplementos() != null) {
                                antonio.devuelveDefensaTotal();
                                antonio.devuelveVelocidadTotal();
                                antonio.devuelveVidaTotal();
                                antonio.devuelveAtaqueTotal();
                            }
                            System.out.println(antonio);
                    }
                    System.out.println();
                    System.out.println("Pulse una tecla para continuar....");
                    s.nextLine();
                    break;
                case 3:
                    Batalla batalla1 = new Batalla(carlos);
                    batalla1.generarHeroeComputer();
                    batalla1.generarComplementoHeroeComputer();
                    batalla1.primerAtaque();
                    System.out.println(batalla1.getHeroeJugador());
                    System.out.println(batalla1.getHeroeComputer());
                    System.out.println("Empieza atacando: " + batalla1.getTurno());

                    while (batalla1.ganador() == null){

                    }
                    break;
                case 4:
                    menuJuego = true;
            }//Switch Menu Juego
        } while (!menuJuego); // MENU JUEGO
    } //MAIN
} //CLASS
