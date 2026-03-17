package ejercicio35;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, "blue", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());

        Rectangle r = new Rectangle(3.0, 4.0, "green", false);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());

        Square s = new Square(5.0, "red", true);
        System.out.println(s);
        System.out.println("Area: " + s.getArea());
    }
}