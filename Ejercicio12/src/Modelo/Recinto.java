package Modelo;

public class Recinto {
    private int id;
    private Zona z1;
    private Zona z2;
    private Zona z3;

    public Recinto(int id, Zona z1, Zona z2, Zona z3) {
        this.id = id;
        this.z1 = z1;
        this.z2 = z2;
        this.z3 = z3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Zona getZ1() {
        return z1;
    }

    public void setZ1(Zona z1) {
        this.z1 = z1;
    }

    public Zona getZ2() {
        return z2;
    }

    public void setZ2(Zona z2) {
        this.z2 = z2;
    }

    public Zona getZ3() {
        return z3;
    }

    public void setZ3(Zona z3) {
        this.z3 = z3;
    }

    public boolean venderEntradaZona(int codigoZona, int cantidadEntrada) {
        return switch (codigoZona) {
            case 1 -> z1.venderEntradas(cantidadEntrada);
            case 2 -> z2.venderEntradas(cantidadEntrada);
            case 3 -> z3.venderEntradas(cantidadEntrada);
            default -> false;
        };
    }



    public float calculcarPrecio(int codigoZona, int cantidadEntrada) {
        return switch (codigoZona) {
            case 1 -> z1.calcularPrecio(cantidadEntrada);
            case 2 -> z2.calcularPrecio(cantidadEntrada);
            case 3 -> z3.calcularPrecio(cantidadEntrada);
            default -> -1;
        };
    }


    public int totalEntradasLibres (){
        return z1.getEntradasPorVender() + z2.getEntradasPorVender() + z3.getEntradasPorVender();
    }

    @Override
    public String toString() {
        return "Recinto: Expo.Coche Martos " + "\n" +
                "\n" + z1  +
                "-----------------------------" + "\n" +
                 z2  +
                "-----------------------------" + "\n" +
                z3 +
                "-----------------------------";
    }
}
