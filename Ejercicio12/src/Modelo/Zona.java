package Modelo;

public class Zona {
    private String denominacion;
    private int entradasPorVender;
    private float precio;

    public Zona(String denominacion, int entradasPorVender, float precio) {
        this.denominacion = denominacion;
        this.entradasPorVender = entradasPorVender;
        this.precio = precio;

    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void setEntradasPorVender(int entradasPorVender) {
        this.entradasPorVender = entradasPorVender;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public boolean hayEntradasDisponibles() {
        return entradasPorVender >= 0;
    }

    public boolean venderEntradas(int cantidadEntradas) {
        if (entradasPorVender < 0)return false;
        // Compruebo q si la entradas q hay es mayor resto
        if (entradasPorVender >= cantidadEntradas) {
            entradasPorVender -= cantidadEntradas;
            return true;
        }
        return false;
    }

    public float calcularPrecio (int numEntradas){
        return precio *= numEntradas;
    }


    @Override
    public String toString() {
        return "Zona: " + denominacion + "\n" +
                " Entradas = " + entradasPorVender + "\n" +
                " Precio = " + precio + "\n";
    }
}
