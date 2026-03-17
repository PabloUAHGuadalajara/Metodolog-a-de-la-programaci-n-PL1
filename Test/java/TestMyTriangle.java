import ejerciciosclases.MyPoint;
import ejerciciosclases.MyTriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        //Constructores
        MyTriangle t1 = new MyTriangle(0,0,6,0,3,5);
        System.out.println(t1);
        MyPoint p1 = new MyPoint(1,0);
        MyPoint p2 = new MyPoint(5,5);
        MyPoint p3 = new MyPoint(5,-5);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        System.out.println(t2);
        MyTriangle t3 = new MyTriangle(1,2,57,3,10,10);
        System.out.println(t3);
        //Perímetro y tipo de triángulo
        System.out.println(t1.getPerimeter());
        System.out.println(t2.getPerimeter());
        System.out.println(t3.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t2.getType());
        System.out.println(t3.getType());
        /*No puede haber triángulos equiláteros, puesto que para ello sería necesario que alguna de las coordenadas
        fuera irracional. Para más información puede buscar en internet
         */
    }
}
