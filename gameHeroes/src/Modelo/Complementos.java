package Modelo;

public class Complementos {
    private String nombre;
    private int ataque;
    private int velocidad;
    private int defensa;
    private int vida;

    public Complementos(String nombre, int ataque, int velocidad, int defensa, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.vida = vida;
    }

    public Complementos (Complementos complementos){
        this.nombre = complementos.getNombre();
        this.ataque = complementos.getAtaque();
        this.velocidad = complementos.getVelocidad();
        this.defensa = complementos.getDefensa();
        this.vida = complementos.getVida();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "\n" +
                "\t\t\t\t\t\tESTADISTICAS" +
                "\n" + "====================================================================" + "\n" +
                " Nombre: " + nombre +
                " , Ataque: " + ataque +
                " , Velocidad: " + velocidad +
                " , Defensa: " + defensa +
                " , Vida: " + vida +
                "\n" + "====================================================================";
    }
}
