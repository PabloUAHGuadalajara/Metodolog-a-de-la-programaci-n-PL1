import ejerciciosclases.MyCircle;
import ejerciciosclases.MyPoint;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        //getters y setters
        MyCircle c1 = new MyCircle(1,1,2);
        MyPoint p1 = new MyPoint(3,3);
        MyCircle c2 = new MyCircle(p1,1);
        MyCircle c3 = new MyCircle();
        System.out.println(c3);
        System.out.println(c1);
        System.out.println(c2);
        c1.setCenter(p1);
        c1.setRadius(2);
        System.out.println(c1.getCenter());
        System.out.println(c1.getRadius());
        System.out.println(c1.getCenterX());
        System.out.println(c1.getCenterY());
        System.out.println(Arrays.toString(c1.getCenterXY()));
        c1.setCenterX(0);
        c1.setCenterY(1);
        c1.setRadius(5);
        System.out.println(c1);
        c1.setCenterXY(10,10);
        System.out.println(c1);
        // Aréa, perimetro y distancia entre centros
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.distance(c3));
    }
}
