package es.uah.matcomp.mp.e4.ejerciciosclases;

public class TestMovable {
    public static void main(String[]args){
        Movable m1=new MovablePoint(2,3,4,6);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
