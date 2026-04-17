package org.lessons.java.abstractanimals;

public class Main {

    public static void main(String[] args) throws Exception {
        AbstractAnimal chico = new Dog();
        Dog milo = new Dog();

        // milo.sleep();
        milo.makeSound();
        milo.isVisible();
        milo.eat();

        chico.sleep();
    }
}
