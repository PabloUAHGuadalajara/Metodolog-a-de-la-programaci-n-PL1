package es.uah.matcomp.mp.e4.ejerciciosclases;

public class TestMovable2 {
    public static void main(String[] args) {
        //Solo probamos circle ya que movable point ya lo probamos
        Movable m2 = new MovableCircle(10, 10, 5, 5, 20);
        System.out.println("Antes: " + m2);
        m2.moveUp();
        m2.moveRight();
        System.out.println("Despues(derecha+arriba): " + m2);
        m2.moveDown();
        m2.moveLeft();
        System.out.println("Vuelve: " + m2);
    }
}
