package org.lessons.java.abstractanimals;

public class Sparrow extends AbstractAnimal implements Flyable {
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp-chirp");
    }

    @Override
    public void eat() {
        System.out.println("Insects");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!!!");
    }
}
