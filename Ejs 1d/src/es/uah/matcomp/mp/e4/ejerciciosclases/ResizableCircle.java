package es.uah.matcomp.mp.e4.ejerciciosclases;

public class ResizableCircle extends CircleR implements Resizable {
    //Contructor
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public String toString(){
        return "ResizableCircle["+super.toString()+"]";
    }

    @Override
    public void resize(int percent) {
        this.radius*=percent/100.0;
    }
}
