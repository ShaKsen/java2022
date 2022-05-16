package ru.gb.shavshina.homework7;

    public class Cat {
        private String name;
        private int appetite;
        private int satiety;

        public String getName() {
            return name;
        }

        public int getAppetite() {
            return appetite;
        }

        public int getSatiety() {
            return satiety;
        }

        public void setSatiety(int satiety) {
            this.satiety = satiety;
        }

        public Cat(String name, int appetite, int satiety) {

            this.name = name;
            this.appetite = appetite;
            this.satiety = 0;
        }

        public void eat(Plate p) {
            p.decreaseFood(appetite);
            }
    }
