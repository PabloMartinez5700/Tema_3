package Ejerc3;

public class Trabajador {
    private String nombre;
    private String email;
    private int num;

    public Trabajador(String nombre, String email, int num) {
        this.nombre = nombre;
        this.email = email;
        this.num = num;
    }

    public Trabajador (Trabajador trabajador){
        this.nombre = trabajador.nombre;
        this.email = trabajador.email;
        this.num = trabajador.num;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
