package Ejerc1;

public class Jugador {
    private String nombre;
    private Domino ficha1;
    private Domino ficha2;
    private Domino ficha3;
    private int puntos;

    public Jugador(String nombre, Domino ficha1, Domino ficha2, Domino ficha3) {
        this.nombre = nombre;
        this.ficha1 = ficha1;
        this.ficha2 = ficha2;
        this.ficha3 = ficha3;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domino getFicha1() {
        return ficha1;
    }

    public void setFicha1(Domino ficha1) {
        this.ficha1 = ficha1;
    }

    public Domino getFicha2() {
        return ficha2;
    }

    public void setFicha2(Domino ficha2) {
        this.ficha2 = ficha2;
    }

    public Domino getFicha3() {
        return ficha3;
    }

    public void setFicha3(Domino ficha3) {
        this.ficha3 = ficha3;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }



    public void calcularPuntos (){
        if (ficha1.encajaFichas(ficha2))puntos++;
        if (ficha2.encajaFichas(ficha3))puntos++;
        if (ficha3.encajaFichas(ficha1))puntos++;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", ficha1=" + ficha1 +
                ", ficha2=" + ficha2 +
                ", ficha3=" + ficha3 +
                " , puntos=" + puntos +
                '}';
    }
}
