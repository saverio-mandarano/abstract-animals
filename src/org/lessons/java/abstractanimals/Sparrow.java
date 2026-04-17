package org.lessons.java.abstractanimals;

public class Sparrow extends AbstractAnimal {
    @Override
    public void makeSound() {
        System.out.println("Chirp-chirp");
    }

    @Override
    public void eat() {
        System.out.println("Insects");
    }
}
