package Modelo;

public class Caballo {
    private String raza;
    private String color;
    private String sexo;
    private String origen;
    private int edad;
    private float peso;
    private float altura;

    public Caballo(String raza, String color, String sexo, String origen, int edad, float peso, float altura) {
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.origen = origen;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void esCumpleaños (){
       this.edad++;
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", sexo='" + sexo + '\'' +
                ", origen='" + origen + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
