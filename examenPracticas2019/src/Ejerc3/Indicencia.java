package Ejerc3;

public class Indicencia {
    private Trabajador trabaj;
    private int puesto;
    private int codigo;
    private String estado;
    private static int pendiente;
    private static int creadas;

    public Indicencia(int puesto, String estado) {
        this.trabaj = null;
        this.puesto = puesto;
        this.codigo = creadas++;
        this.estado = "Pendiente";
    }

    public Trabajador getTrabaj() {
        return trabaj;
    }

    public void setTrabaj(Trabajador trabaj) {
        this.trabaj = trabaj;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getPendiente() {
        return pendiente;
    }

    public static void setPendiente(int pendiente) {
        Indicencia.pendiente = pendiente;
    }

    public static int getCreadas() {
        return creadas;
    }

    public static void setCreadas(int creadas) {
        Indicencia.creadas = creadas;
    }

    public boolean asignar (Trabajador trabaj){
        if (this.trabaj != null) return false;
        this.trabaj = new Trabajador(trabaj);
        return true;
    }

    public boolean resuelve (String resolucion){
        if (asignar(this.trabaj)){
            if (this.estado.equalsIgnoreCase("Pendiente")){
                this.estado = "Resuelta";
                this.trabaj = null;
                return true;
            }
        }
        return false;
    }


}
