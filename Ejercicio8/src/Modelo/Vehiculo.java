package Modelo;

public class Vehiculo {
    private int id;
    private static float kilometrosTotales;
    private float kilometrosRecorridos;
    private static int vehiculosCreados;

    public Vehiculo(int id, float kilometrosRecorridos) {
        this.id = id;
        kilometrosTotales += kilometrosRecorridos;
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculosCreados++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void setKilometrosTotales(float kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public float getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(float kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    // Otros metodos

    public void sumarKilometros (float km){
        if (km >=0){
            this.kilometrosRecorridos += km;
            Vehiculo.kilometrosTotales += kilometrosRecorridos;
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "****************************************\n";
        cadena += "ID: " + this.id + "\n";
        cadena += "Kilometros Totales: " + Vehiculo.kilometrosTotales + "km\n";
        cadena += "Kilometros recorridos: " + this.kilometrosRecorridos + "km\n";
        cadena += "****************************************\n";
        return cadena;
    }
}
