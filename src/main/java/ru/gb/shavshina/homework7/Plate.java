package ru.gb.shavshina.homework7;

    public class Plate {
        private int food;

        int getFood() {
            return food;
        }

        public Plate(int food) {
            this.food = food;
        }

        void decreaseFood(int n) {
            food -= n;
        }

        public void increaseFood() {
            this.food += 200;
            System.out.println("В тарелку добавили 200 грамм корма");
        }

        public boolean checkFood(int n) {
            return food >= n;
        }

    }
