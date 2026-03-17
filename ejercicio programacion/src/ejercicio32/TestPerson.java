package ejercicio32;

public class TestPerson {
    public static void main(String[] args) {
        Student s = new Student("Ana", "Calle Mayor 1", "Informatica", 2, 1500.0);
        System.out.println(s);

        Staff st = new Staff("Carlos", "Calle Sol 5", "FIB", 2000.0);
        System.out.println(st);
    }
}
