package ru.gb.shavshina.hw1;

public class Cat implements Player{
    private String name;
    private int maxLength;
    private int maxHeight;


    public Cat (String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }
    public String runStr() {
        return name + " может пробежать: " + maxLength + " км";
    }
    public String jumpStr() {
        return name + " может прыгнуть: " + maxHeight + " м";
    }
    public String getName(){
        return name;
    }
    public int getMaxLength(){
        return maxLength;
    }
    public int getMaxHeight(){
        return maxHeight;
    }

}
