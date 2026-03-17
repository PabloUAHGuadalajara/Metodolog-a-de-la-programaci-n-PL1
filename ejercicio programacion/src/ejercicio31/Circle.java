package ejercicio31;

public class Circle {
    // Atributos privados con valores por defecto
    private double radius = 1.0;
    private String color = "red";

    // Constructor sin argumentos (por defecto)
    public Circle() {
    }

    // Constructor con radio
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor con radio y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters y Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Calcula el área del círculo
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Devuelve una representación en texto
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
