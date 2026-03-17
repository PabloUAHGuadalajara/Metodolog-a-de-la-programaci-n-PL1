import ejerciciosclases.MyLine;
import ejerciciosclases.MyPoint;

import java.util.Arrays;
public class TestMyLine {
    public static void main(String[] args) {
        //getters y setters
        MyPoint p1 = new MyPoint(3,3);
        MyPoint p2 = new MyPoint(3,5);
        MyLine l2 = new MyLine(p1,p2);
        MyLine l1 = new MyLine(1,1,2,2);
        System.out.println(l1);
        System.out.println(l2);
        l1.setBegin(p1);
        l1.setEnd(p2);
        System.out.println(l1.getBegin());
        System.out.println(l1.getEnd());
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(Arrays.toString(l1.getBeginXY()));
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());
        System.out.println(Arrays.toString(l1.getEndXY()));
        l1.setBeginX(0);
        l1.setBeginY(1);
        l1.setEndX(2);
        l1.setEndY(3);
        System.out.println(l1);
        l1.setBeginXY(1,1);
        l1.setEndXY(2,2);
        System.out.println(l1);
        // Distancia entre begin y end
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
    }
}
