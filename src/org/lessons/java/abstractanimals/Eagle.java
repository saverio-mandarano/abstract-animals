package org.lessons.java.abstractanimals;

public class Eagle extends AbstractAnimal {
    @Override
    public void makeSound() {
        System.out.println("Kly-kly-kly");
    }

    @Override
    public void eat() {
        System.out.println("Small mammals, birds");
    }
}
