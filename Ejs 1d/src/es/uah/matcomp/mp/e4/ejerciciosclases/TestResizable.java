package es.uah.matcomp.mp.e4.ejerciciosclases;

public class TestResizable {
    public static void main(String[]args){
        //No probamos geometric object ya que ya se prueba anteriormente
        //Como CircleR es un copia y pega de Circle, copiamos su tester
        //Crear circulo y rectangulo
        GeometricObject g1=new CircleR(4.0);
        //Imprimirlas
        System.out.println(g1);
        //Probar metodos
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        //Veamos ahora ResizableCircle
        ResizableCircle r1=new ResizableCircle(2.0);
        //Lo imprimimos
        System.out.println(r1);
        //Probar metodos del padre
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        //Probar resize
        r1.resize(50);
        System.out.println(r1);

    }
}
