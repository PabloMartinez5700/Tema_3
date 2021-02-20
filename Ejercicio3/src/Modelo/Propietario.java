package Modelo;

public class Propietario {

    private String nombre;
    private String dni;
    private long movil;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public long getMovil() {
        return movil;
    }

    public void setMovil(long movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "\n";
        cadena += "\tDNI: " + this.dni +  "\n";
        cadena += "\tNombre: " + this.nombre + "\n";
        cadena += "\tTelefono: " + this.movil + "\n";
        cadena += "\tEmail: " + this.email + "\n";
        return cadena;
    }
}
