package ru.gb.shavshina.homework2;

public class Lesson {
    public static void main(String[] args) {
        System.out.println(twoNumber(15, 15));
    }
    public static boolean twoNumber(int a, int b){
int sum = a + b;
if (sum >= 10 && sum <=20){
    return true;
}
else{
    return false;
}
    }
}
