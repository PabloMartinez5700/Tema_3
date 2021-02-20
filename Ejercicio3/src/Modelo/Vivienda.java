package Modelo;

public class Vivienda {
    private int codigo;
    private String calle;
    private int numero;
    private int codigoPostal;
    private String piso;
    private float tamanio;
    private boolean conGarage;
    private int numHabitaciones;
    private float precio;
    private boolean obraNueva;
    private Propietario propietario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isConGarage() {
        return conGarage;
    }

    public void setConGarage(boolean conGarage) {
        this.conGarage = conGarage;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public boolean setNumHabitaciones(int numHabitaciones) {
        //Controlo que no meta un num negativo
        if (numHabitaciones <= 0) return false;
        else {
            this.numHabitaciones = numHabitaciones;
            return true;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public boolean setPrecio(float precio) {
        if (precio <= 0) return false;
        else {
            this.precio = precio;
            return true;
        }
    }

    public boolean isObraNueva() {
        return obraNueva;
    }

    public void setObraNueva(boolean obraNueva) {
        this.obraNueva = obraNueva;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public float precioConIva() {
        return this.precio * (obraNueva ? 1.12f : 1.08f);
    }

    @Override
    public String toString() {
        return "\n\t\t\tINFORMACIÓN DE LA VIVIENDA\n" +
                "======================================================\n" +
                "Código: " + codigo +
                "\nCalle: " + calle +
                "\nNúmero: " + numero +
                "\nCódigo Postal: " + codigoPostal +
                "\nPiso: " + piso +
                String.format("\nTamaño: %.2f m2", this.tamanio) +
                "\n¿Tiene Garage?: " + ((conGarage) ? "Si" : "No") +
                "\nNumero de Habitaciones: " + numHabitaciones +
                String.format("\nPrecio: %.2f€", this.precio) +
                "\n¿Es nueva?: " + ((obraNueva) ? "Si" : "No") +
                String.format("\nPrecio Con IVA: %.2f€", precioConIva()) +
                "\nPropietario: " + propietario +
                "======================================================\n";
    }
}
