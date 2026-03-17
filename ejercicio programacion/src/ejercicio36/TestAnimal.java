package ejercicio36;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Whisky");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");

        System.out.println(cat);
        System.out.println(dog1);

        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}

// "¿Puedo hacer una llamada a greets() de un animal?"
// No, porque Animal no tiene el método greets().
//  Solo lo tienen Cat y Dog.
//  Si intentases hacer Animal a = new Animal("x"); a.greets(); el compilador daría error.