package Modelo;

public class Cuenta {

    // Declaramos los atributos
    private long num;
    private String cliente;
    private float saldo;
    private float interesAnual;
    //Declaro como publicas y estaticas para poder utilzar en el main
    public static String banco = "BBVA";
    public static int contadorCuentas = 0;



    // Declaramos los metodos
    public void ingreso(float saldo) {
        this.saldo += saldo;
    }

    public void reintegro(float saldo) {
        this.saldo -= saldo;
    }

    public void ingresoInteresMes() {
        this.saldo = this.interesAnual + (this.saldo / 1200);
    }

    public Boolean enRojos() {
        if (this.saldo < 0) return true;
        return false;
    }

    public float leerSaldo() {
        return this.saldo;
    }

    //public String leerBanco() { return this.banco; }
}
