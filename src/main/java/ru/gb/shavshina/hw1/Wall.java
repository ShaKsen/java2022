package ru.gb.shavshina.hw1;

public class Wall implements Hurdles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Boolean check(Player player) {


        if (player.getMaxLength() >= height) {

            System.out.println("Игрок " + player.getName() + " перепрыгнул стену высотой: " + height + " м");
            return true;
        } else {

            System.out.println("Игрок " + player.getName() + " не перепрыгнул стену высотой: " + height + " м");
            return false;
        }
    }
}
