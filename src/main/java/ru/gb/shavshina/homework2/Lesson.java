package ru.gb.shavshina.homework2;

public class Lesson {

    public static void main(String[] args) {
        System.out.println(twoNumber(15, 15));

        dashesOfNumber(100);
        System.out.println(newNumber(-28));
        printWord("Лето,где ты???!!", 10);
        System.out.println(checkYear(1900));
    }

    public static boolean twoNumber(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void dashesOfNumber(int i) {
        if (i >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean newNumber(int z) {
        if (z >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printWord(String word, int times) {
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }
    public static boolean checkYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            return false;
        } else {
            return true;
        }
    }
}



