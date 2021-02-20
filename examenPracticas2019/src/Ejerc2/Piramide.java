package Ejerc2;

public class Piramide {
    private int altura;
    private static int piramideCreadas = 0;

    public Piramide(int altura) {
        this.altura = altura;
        piramideCreadas++;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static int getPiramideCreadas() {
        return piramideCreadas;
    }

    public static void setPiramideCreadas(int piramideCreadas) {
        Piramide.piramideCreadas = piramideCreadas;
    }


    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - (i + 1); j++){
                cadena += " ";
            }
            for (int k = 0; k < (i + 1); k++) {
               cadena += "* ";
            }
           cadena += "\n";
        }
        return cadena;
    }
}
