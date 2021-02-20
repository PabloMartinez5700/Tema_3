package Ejerc2;

public class Rectangulo {
    private int base;
    private int altura;
    private static int rectangulosCreados =0;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    public static void setRectangulosCreados(int rectangulosCreados) {
        Rectangulo.rectangulosCreados = rectangulosCreados;
    }


    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < altura;i++){
            cadena += "\n";
            for (int j = 0; j < base - 1;j++){
                cadena += "*";
            }
        }
        return cadena;
    }
}
