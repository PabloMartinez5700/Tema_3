package Modelo;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    private String email;
    private String clave;
    private String nombre;
    private long movil;
    private int annio_Nacimiento;

    public Usuario(String email, String nombre, long movil, int annio_Nacimiento) {
        this.email = email;
        this.clave = coficarClave("1234");
        this.nombre = nombre;
        this.movil = movil;
        this.annio_Nacimiento = annio_Nacimiento;
    }

    public Usuario (){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getMovil() {
        return movil;
    }

    public void setMovil(long movil) {
        this.movil = movil;
    }

    public int getAnnio_Nacimiento() {
        return annio_Nacimiento;
    }

    public void setAnnio_Nacimiento(int annio_Nacimiento) {
        this.annio_Nacimiento = annio_Nacimiento;
    }

    public boolean claveValida(String clave) {
        return coficarClave(clave).equalsIgnoreCase(coficarClave(this.clave));
    }

    public boolean compruebaEmail(String email) {
        for (int i = 0; i < email.length(); i++) {
            char arroba = email.charAt(i);
            if (arroba == '@') {
                this.email = email;
                return true;
            }

        }
        return false;
    }

    public boolean mayorDeEdad() {
        Calendar annio = new GregorianCalendar();
        int edad, annioActual;
        annioActual = annio.get(Calendar.YEAR);
        if (this.annio_Nacimiento > 0){
            edad = annioActual - this.annio_Nacimiento;
            return edad >= 18;
        }
       return false;
    }

    public void cambioClave(String claveNueva) {
        this.clave = claveNueva;
        coficarClave(this.clave);
    }

    public String coficarClave(String clave) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte [] md = messageDigest.digest(clave.getBytes());
            BigInteger numero = new BigInteger(1,md);
            String texto = numero.toString(16);

            while (texto.length() < 32){
                texto = "0".concat(texto);
            }
            return texto;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return "\n" + " ---------------- USUARIO ---------------- \n" +
                "|     ■  Nombre: " + nombre + "     \n" +
                "|     ■  Año de Nacimiento: " + annio_Nacimiento + "\n" +
                ((mayorDeEdad()) ?    "|     ■  ¿Mayor de Edad?: Si " :   "|     ■  ¿Mayor de Edad?: No ") + "\n" +
                "|     ■  Telefono: " + movil + "\n" +
                "|     ■  Email: " + email + "\n";
    }
}
