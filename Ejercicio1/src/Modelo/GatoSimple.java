package Modelo;

public class GatoSimple {

    private String color;
    private String raza;
    private String sexo;
    private int edad;
    private boolean hambre;
    private double peso;

    public GatoSimple(String color, String raza, String sexo, int edad, boolean hambre, double peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.hambre = hambre;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean tieneHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public double getPeso() { return peso; }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Otros metodos

    public boolean come(String tipoComida) {
        if (!tieneHambre())return false;

        if (tipoComida.equalsIgnoreCase("pescado")){
           this.hambre = false;
           return true;
        }
        return false;
    }

    public boolean pelaCon(GatoSimple gato) {
        return gato.sexo.equalsIgnoreCase("macho") && sexo.equalsIgnoreCase("macho");
    }
}
