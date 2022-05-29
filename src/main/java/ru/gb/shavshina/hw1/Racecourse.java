package ru.gb.shavshina.hw1;


    public class Racecourse implements Hurdles {
        private int length;

        public Racecourse(int length) {
            this.length = length;
        }

        public Boolean check(Player player) {


            if (player.getMaxLength() >= length) {

                System.out.println("Игрок " + player.getName() + " пробегает дистанцию длиной: " + length + " км");
                return true;
            } else {

                System.out.println("Игрок " + player.getName() + " не пробегает дистанцию длиной: " + length + " км");
                return false;
            }
        }
    }

