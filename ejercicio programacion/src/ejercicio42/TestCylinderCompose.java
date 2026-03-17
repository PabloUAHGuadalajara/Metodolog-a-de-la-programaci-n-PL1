package ejercicio42;

public class TestCylinderCompose {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Volume: " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.0, 5.0);
        System.out.println(c2);
        System.out.println("Volume: " + c2.getVolume());
    }
}

//Para este caso la composición es mejor porque un cilindro no es un círculo, sino que tiene un círculo como base.
// La herencia fuerza una relación que no es natural.
//Además, con composición puedes cambiar el círculo base en tiempo de ejecución, lo que da más flexibilidad.