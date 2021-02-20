package Modelo;

public class Fracción {
    private int numerador;
    private int denominador;

    public Fracción(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void invertir() {
        int denominadorAux = this.denominador;
        this.denominador = this.numerador;
        this.numerador = denominadorAux;
    }

    public Fracción simplificar(int num) {
        if (numerador % num != 0 || denominador % num != num) return null;
        numerador /= num;
        denominador /= num;
        return this;
    }


    public void multiplicar(int num) {
        if (num >= 0) {
            this.numerador *= num;
        }
    }

    public void dividir(int num) {
        int resul, numeradorAux;
        if (num >= 0) {
            numeradorAux = this.numerador;
            resul = this.denominador * num;
            this.numerador = resul;
            this.denominador = numeradorAux;
        }
    }

    /*
    public static boolean comprobarFraccion(Fracción f1) {
        int longuitud = 0;
        for (int i = 0; i < f1.(); i++) {
            longuitud++;
            if (longuitud == 3) return true;
        }
        return false;
    }

     */

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

}
