package Modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The type Batalla.
 */
public class Batalla {
    private Heroe heroeJugador;
    private Heroe heroeComputer;
    private int turnos;
    private GregorianCalendar inicio;
    private int turno;

    /**
     * Instantiates a new Batalla.
     *
     * @param heroeJugador the heroe jugador
     */
    public Batalla(Heroe heroeJugador) {
        this.heroeJugador = heroeJugador;
        this.turnos = 0;
        this.inicio = new GregorianCalendar();
        this.turno = 1;
    }

    /**
     * Gets heroe jugador.
     *
     * @return the heroe jugador
     */
    public Heroe getHeroeJugador() {
        return heroeJugador;
    }

    /**
     * Sets heroe jugador.
     *
     * @param heroeJugador the heroe jugador
     */
    public void setHeroeJugador(Heroe heroeJugador) {
        this.heroeJugador = heroeJugador;
    }

    /**
     * Gets heroe computer.
     *
     * @return the heroe computer
     */
    public Heroe getHeroeComputer() {
        return heroeComputer;
    }

    /**
     * Sets heroe computer.
     *
     * @param heroeComputer the heroe computer
     */
    public void setHeroeComputer(Heroe heroeComputer) {
        this.heroeComputer = heroeComputer;
    }

    /**
     * Gets turnos.
     *
     * @return the turnos
     */
    public int getTurnos() {
        return turnos;
    }

    /**
     * Sets turnos.
     *
     * @param turnos the turnos
     */
    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    /**
     * Gets inico.
     *
     * @return the inico
     */
    public GregorianCalendar getInico() {
        return inicio;
    }

    /**
     * Sets inico.
     *
     * @param inico the inico
     */
    public void setInico(GregorianCalendar inico) {
        this.inicio = inico;
    }

    /**
     * Gets turno.
     *
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Sets turno.
     *
     * @param turno the turno
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * Ganador heroe.
     *
     * @return the heroe
     */
    public Heroe ganador() {
        if (!heroeJugador.estaVivo()) return heroeComputer;
        else {
            if (!heroeComputer.estaVivo()) return heroeJugador;
        }
        return null;
    }

    /**
     * Primer ataque.
     */
    public void primerAtaque() {
        if (heroeComputer != null) {
            turno = (heroeJugador.devuelveVelocidadTotal() >= heroeComputer.devuelveVelocidadTotal() ? 1 : 2);
        }
    }

    /**
     * Generar heroe computer.
     */
    public void generarHeroeComputer() {
        int heroeCpu = (int) (Math.random() * 4 + 1);

        switch (heroeCpu) {
            case 1:
                heroeComputer = new Heroe("Carlos", 30, 30, 15, 100, heroeComputer.getApariencia());
                break;
            case 2:
                heroeComputer = new Heroe("Loli", 20, 15, 30, 100, heroeComputer.getApariencia());
                break;
            case 3:
                heroeComputer = new Heroe("Patricia", 10, 10, 20, 100, heroeComputer.getApariencia());
                break;
            case 4:
                heroeComputer = new Heroe("Antonio", 30, 5, 10, 100, heroeComputer.getApariencia());
                break;
        }


    }

    /**
     * Generar complemento heroe computer.
     */
    public void generarComplementoHeroeComputer() {
        int complenetoCpu = (int) ((Math.random() * 16 + 1));

        if (heroeComputer.getNombre().equalsIgnoreCase("Carlos")) {
            switch (complenetoCpu) {
                case 1:
                    heroeComputer.equiparComplemento(new Complementos("Mac", 10, 20, 0, 5));
                    break;
                case 2:
                    heroeComputer.equiparComplemento(new Complementos("Mochila", 25, 0, 0, 15));
                    break;
                case 3:
                    heroeComputer.equiparComplemento(new Complementos("Plumon Rojo", 0, 10, 30, 20));
                    break;
                case 4:
                    heroeComputer.equiparComplemento(new Complementos("Preguntas TEST", 40, 0, 0, 10));
                    break;
                case 5:
            }
        }

        if (heroeComputer.getNombre().equalsIgnoreCase("Loli")) {
            switch (complenetoCpu) {
                case 6:
                    heroeComputer.equiparComplemento(new Complementos("MYSQL", 30, 0, 0, 15));
                    break;
                case 7:
                    heroeComputer.equiparComplemento(new Complementos("Ejercicios A PUNTA PALA", 30, 0, 40, 0));
                    break;
                case 8:
                    heroeComputer.equiparComplemento(new Complementos("Tacones", 0, 20, 0, 10));
                    break;
                case 9:
            }
        }

        if (heroeComputer.getNombre().equalsIgnoreCase("Patricia")) {
            switch (complenetoCpu) {
                case 10:
                    heroeComputer.equiparComplemento(new Complementos("Guapura", 0, 0, 30, 20));
                    break;
                case 11:
                    heroeComputer.equiparComplemento(new Complementos("Maquinas Virtuales", 15, 10, 0, 2));
                    break;
                case 12:
            }
        }

        if (heroeComputer.getNombre().equalsIgnoreCase("Antonio")) {
            switch (complenetoCpu) {
                case 13:
                    heroeComputer.equiparComplemento(new Complementos("Churros", 0, 0, 20, 10));
                    break;
                case 14:
                    heroeComputer.equiparComplemento(new Complementos("Palmadita Espalda", 30, 10, 0, 0));
                    break;
                case 15:
                    heroeComputer.equiparComplemento(new Complementos("HTML a Papel", 40, 0, 15, 10));
                    break;
                case 16:
            }
        }
    }

    /**
     * Turno.
     */
    public void turno (){
        if (turno == 1) heroeComputer.restaVida(heroeJugador.devuelveAtaqueTotal() - heroeComputer.devuelveDefensaTotal());
        else heroeJugador.restaVida(heroeComputer.devuelveAtaqueTotal() - heroeJugador.devuelveDefensaTotal());
        turnos++;
        turno = (turno == 1) ? 2 : 1;
    }


    public String toString() {
        return "\n" +
                "\t\t\t\t\t\t\t\t\t\t\tFECHA DEL COMBATE: " + inicio.get(Calendar.DAY_OF_MONTH) + "/" + (inicio.get(Calendar.MONTH) + 1) + "/" + inicio.get(Calendar.YEAR) +
                "\t\tHORA DEL COMBATE: " + inicio.get(Calendar.HOUR_OF_DAY) + ":" + inicio.get(Calendar.MINUTE) + "\n" +
                "\tBATALLA ENTRE " + heroeJugador.getNombre().toUpperCase() + " vs " + heroeComputer.getNombre().toUpperCase() + "\n";
    }
}
