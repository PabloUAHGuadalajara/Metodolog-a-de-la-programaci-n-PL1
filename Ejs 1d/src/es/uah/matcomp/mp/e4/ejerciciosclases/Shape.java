package es.uah.matcomp.mp.e4.ejerciciosclases;

public abstract class Shape {
    protected String color="red";
    protected Boolean filled=true;
    //Contructores
    public Shape(){}
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //Metodos
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //Metodos abstractos
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }

}
