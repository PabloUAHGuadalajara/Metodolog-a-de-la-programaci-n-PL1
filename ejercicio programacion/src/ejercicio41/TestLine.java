package ejercicio41;

public class TestLine {
    public static void main(String[] args) {
        // Prueba con composición (Line)
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient: " + l1.getGradient());

        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        // Prueba con herencia (LineSub)
        LineSub ls1 = new LineSub(0, 0, 3, 4);
        System.out.println(ls1);
        System.out.println("Length: " + ls1.getLength());
    }
}

//Para este caso la composición (Line) es mejor porque una línea no es un punto, sino que tiene dos puntos.
// La herencia se usa cuando hay una relación del tipo "es un", como "un perro es un animal".
// Aquí forzar esa relación con LineSub resulta poco natural.