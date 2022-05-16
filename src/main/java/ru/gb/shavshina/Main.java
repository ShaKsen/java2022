package ru.gb.shavshina;


import ru.gb.shavshina.homework7.Cat;
import ru.gb.shavshina.homework7.Plate;

    public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Лёва", 120, 8);
        cat[1] = new Cat("Снежок", 80, 6);
        cat[2] = new Cat("Борисыч", 50, 4);
        cat[3] = new Cat("Шлёпа", 60, 2);
        Plate plate = new Plate(100);

            for (Cat i : cat) {

                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    i.eat(plate);
                    System.out.println("Котик " + i.getName() + " съел " + i.getAppetite() + " граммов корма");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            }
            }


