package Modelo;

public class Dni {
    private int num;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    //GETTERS
    public int getDni() {
        return num;
    }

    public String getNif() {
        String letra = calcularLetraNif(this.num);
        return this.num + letra;
    }

    //SETTERS

    public boolean setDni(String nif) {
        if (validarNif(nif)) {
            this.num = extraerNumeroNif(nif);
            return true;
        } else return false;
    }

    public void setDni(int dni) {  //En el diagrama UML hay un boolean pero no es necesario.
        this.num = dni;
    }

    //METODOS ALTERNATIVOS
    private String calcularLetraNif(int dni) { //Dado un numero devuelve una letra
        int resto = dni % 23; // Calculo la posicion con el modulo 23
        return String.valueOf(LETRAS.charAt(resto));
    }

    private boolean validarNif(String nif) {
        //Compruebo si la longitud es 9.
        if (nif.length() != 9) return false;
        for (int i = 0; i < 8; i++) {
            char num = nif.charAt(i);
            if (Character.isLetter(num)) return false;
        }
        if (Character.isDigit(nif.charAt(8))) return false;

        String letraBien = calcularLetraNif(extraerNumeroNif(nif));
        return letraBien.equals(extraerLetraNif(nif));
    }

    private String extraerLetraNif(String nif) {
        return nif.substring(8);
    }

    private int extraerNumeroNif(String nif) {
        return Integer.parseInt(nif.substring(0, 8));
    }
}
