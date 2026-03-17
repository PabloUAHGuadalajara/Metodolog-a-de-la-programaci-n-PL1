package es.uah.matcomp.mp.e4.ejerciciosclases;

public class TestGeometricObject {
    public static void main(String[] args) {
        //Crear circulo y rectangulo
        GeometricObject g1=new Circle(2.0);
        GeometricObject g2=new Rectangle(2.0,3.0);
        //Imprimirlas
        System.out.println(g1);
        System.out.println(g2);
        //Probar metodos
        System.out.println(g1.getArea());
        System.out.println(g2.getArea());
        System.out.println(g1.getPerimeter());
        System.out.println(g2.getPerimeter());
    }
}
