package Ejerc2;

public class main {
    public static void main(String[] args) {
        Piramide p1 = new Piramide(4);
        System.out.println();
        System.out.println(p1);
        System.out.println("Piramides: " + Piramide.getPiramideCreadas());

        Rectangulo rect1 = new Rectangulo(4,3);
        Rectangulo rect2 = new Rectangulo(6,2);
        System.out.println(rect1);
        System.out.println();
        System.out.println(rect2);
        System.out.println("Rectangulos: " + Rectangulo.getRectangulosCreados());
    }
}
