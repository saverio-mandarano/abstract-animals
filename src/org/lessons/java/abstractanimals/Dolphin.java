package org.lessons.java.abstractanimals;

public class Dolphin extends AbstractAnimal implements Swimmable {

    @Override
    public void makeSound() {
        System.out.println("Click-click");
    }

    @Override
    public void eat() {
        System.out.println("Fish, squid");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!!!");
    }
}
