package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Square extends RectangleShape {

    // Constructores
    public Square() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    //Metodos
    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]]";
    }
}
