package ru.gb.shavshina.homework6;

public abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;


    public abstract void run(int length);

    public abstract void swim(int length);
    public static int count = 0;
    public Animal (){
        count++;
    }
}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    public static int count = 0;
    public Cat (){
        count++;
    }

   public void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("Кот пробежал " + length + " м.");
        } else {
            System.out.println("Кот не пробежал дистанцию");
        }
    }


    public void swim(int length) {
        System.out.println("Кот не плавает");
    }
}

    class Dog extends Animal {
        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;
        public static int count = 0;
        public Dog () {
            count++;
        }
        public void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)){
                System.out.println("Собака пробежала " + length + " м.");
            }
            else {
                System.out.println("Собака не пробежала дистанцию");
            }
        }


        public void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH)){
                System.out.println("Собака проплыла " + length + " м.");
            }
            else {
                System.out.println("Собака не проплыла дистанцию");
            }
        }
    }


