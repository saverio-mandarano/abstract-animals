package org.lessons.java.abstractanimals;

public class Dog extends AbstractAnimal {

    public void isVisible() {
        System.out.println("sono visibile");
    }

    @Override
    public void makeSound() {
        System.out.println("Bau");
    }

    @Override
    public void eat() {
        System.out.println("Croccantini");
    }

}
