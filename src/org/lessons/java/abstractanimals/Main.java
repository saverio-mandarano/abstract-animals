package org.lessons.java.abstractanimals;

public class Main {

    public static void main(String[] args) throws Exception {
        // AbstractAnimal chico = new Dog();
        // Dog milo = new Dog();
        // Dolphin nemo = new Dolphin();
        // Eagle titti = new Eagle();
        // Swimmable pellegrini = new Dolphin();

        // milo.sleep();
        // milo.makeSound();
        // milo.isVisible();
        // milo.eat();
        // chico.sleep();
        // nemo.swim();
        // titti.fly();
        // pellegrini.swim();

        // Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        Dolphin dolphin = new Dolphin();

        makeFly(eagle);
        makeFly(sparrow);
        // makeFly(dog);
        makeSwim(dolphin);

    }

    public static void makeFly(Flyable animal) {
        animal.fly();
    }

    public static void makeSwim(Swimmable animal) {
        animal.swim();
    }
}
