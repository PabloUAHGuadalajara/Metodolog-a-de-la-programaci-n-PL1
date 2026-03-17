package es.uah.matcomp.mp.e4.ejerciciosclases;

public class SalidasObtenidas {
    //Las salidas que se obtendrian estan a la derecha

    /*Public class TestAnimal {
 public static void main(String[] args) {
 // Using the subclasses
 Cat cat1 = new Cat();
 cat1.greeting();                   //Imprimiria "Meow!" (implementacion de cat)
 Dog dog1 = new Dog();
 dog1.greeting();                   //Imprimiria "Woof!" (implementacion de dog)
 BigDog bigDog1 = new BigDog();
 bigDog1.greeting();                //Imprimiria "Woow!" (implementacion de bigdog)

 // Using Polymorphism
 Animal animal1 = new Cat();
 animal1.greeting();                //Imprimiria "Meow!" (animal1 es un cat)
 Animal animal2 = new Dog();
 animal2.greeting();                //Imprimiria "Woof!" (animal2 es un dog)
 Animal animal3 = new BigDog();
 animal3.greeting();                //Imprimiria "Woow!" (animal3 es un bigdog)
 Animal animal4 = new Animal();     //No se puede crear un nuevo animal abstracto, tienes que decir si es cat,dog o bigdog

 // Downcast
 Dog dog2 = (Dog)animal2;           //dog2 es tipo Dog
 BigDog bigDog2 = (BigDog)animal3;  //bigDog2 es tipo BigDog
 Dog dog3 = (Dog)animal3;           //dog3 es tipo BigDog (en la memoria, animal3 es BigDog) pero se trata como Dog y solo puede usar lo que tenga Dog(aunque si hay overrdie y bigdog lo tiene, se usara ese)
 Cat cat2 = (Cat)animal2;           //Aqui falla,animal2 es Dog y no puede ser tratado como cat(en la de antes si se podia porque BigDog hereda Dog)
 dog2.greeting(dog3);               //Imprime "Woooooooof!", al ser dog2 y Dog
 dog3.greeting(dog2);               //Imprime "Woooooowwww!", porque se usa el metodo greeting de dog3, que es realmente un BigDog, y como tiene Override, su metodo se superpone
 dog2.greeting(bigDog2);            //Imprime "Woooooooof!" (como bigDog2, es another Dog, se puede hacer)
 bigDog2.greeting(dog2);            //Imprime "Woooooowwww!" es un BigDog saludando a un Dog
 bigDog2.greeting(bigDog1);         //Imprime "Woooooowwww!" es un BigDog saludando a un BigDog
 }
}

     */
}
