package ru.gb.shavshina.homework6;

public class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat.run(201);
        cat1.run(150);
        cat.swim(0);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
        System.out.println("Животных " + Animal.count);
        System.out.println("Котов " + Cat.count);
        System.out.println("Собак " + Dog.count);
    }

}
