/*
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita
saber el tamaño - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su
estado - pedida o servida. La clase debe almacenar información sobre el número total de
pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva, su
estado es “pedida”. El siguiente código del programa principal debe dar la salida que se
muestra:
 */

package Modelo;

public class Pizza {
    private int codigo;
    private String tipo;
    private String tamaño;
    private String estado;
    private static int pedidasTotales = 0;
    private static int servidasTotales = 0;

    public Pizza(int codigo, String tipo, String tamaño) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        pedidasTotales++;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getPedidasTotales() {
        return pedidasTotales;
    }

    public static void setPedidasTotales(int peditalesTotales) {
        Pizza.pedidasTotales = peditalesTotales;
    }

    public static int getServidasTotales() {
        return servidasTotales;
    }

    public static void setServidasTotales(int servidasTotales) {
        Pizza.servidasTotales = servidasTotales;
    }

    public boolean sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            servidasTotales++;
            pedidasTotales--;
            return true;
        }
        if (this.estado.equals("servida")) return false;
      return false;
    }


    @Override
    public String toString() {
        return "\n\t\t\tPIZZA\n" +
                "============================\n" +
                "Codigo --> " + this.codigo + "\n" +
                "Tipo --> " + this.tipo + "\n" +
                "Tamaño --> " + this.tamaño + "\n" +
                "Estado --> " + this.estado + "\n" +
                "============================\n";

    }
}
