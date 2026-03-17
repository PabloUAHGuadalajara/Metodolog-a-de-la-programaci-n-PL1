package es.uah.matcomp.mp.e4.ejerciciosclases;

public class TestAnimal {
    public static void main(String[] args) {
        //1.Pruebas de gatos
        Cat cat1 = new Cat("Misifu");
        cat1.greets();
        //2.Pruebas de perros
        Dog dog1=new Dog("Vini");
        Dog dog2=new Dog("Firulais");
        dog1.greets();
        dog1.greets(dog2);//A otro perro
        //3.Pruebas de BigDog
        BigDog bigDog1=new BigDog("Pablo");
        BigDog bigDog2=new BigDog("Chamo");
        bigDog1.greets();
        bigDog1.greets(dog1);//Perro grande a normal
        bigDog1.greets(bigDog2);//Perro grande a otro
        //4.Probar animal bien
        Animal animal1=new Cat("Michi");
        Animal animal2=new Dog("Pluto");
        Animal animal3=new BigDog("Trompetista");

        animal1.greets();
        animal2.greets();
        animal3.greets();

        Dog dog3 = new BigDog("Rodolfo");
        bigDog1.greets(dog3);
    }
}
