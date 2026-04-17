package org.lessons.java.abstractanimals;

public class Eagle extends AbstractAnimal implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Kly-kly-kly");
    }

    @Override
    public void eat() {
        System.out.println("Small mammals, birds");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!!!");
    }
}
