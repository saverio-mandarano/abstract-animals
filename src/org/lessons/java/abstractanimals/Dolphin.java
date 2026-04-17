package org.lessons.java.abstractanimals;

public class Dolphin extends AbstractAnimal {
    @Override
    public void makeSound() {
        System.out.println("Click-click");
    }

    @Override
    public void eat() {
        System.out.println("Fish, squid");
    }
}
