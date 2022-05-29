package ru.gb.shavshina;
 /*      1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
          классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
          консоль).
          2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
          должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
          печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
          3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
          этот набор препятствий.
          4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
          на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
          препятствий не идет*/


import ru.gb.shavshina.hw1.*;


public class Main {
    public static void main(String[] args) {

        Player cat1 = new Cat("Снежок", 8, 15);
        Player cat2 = new Cat("Лёва", 10, 17);

        Player human1 = new Human("Макс", 25, 7);
        Player human2 = new Human("Карина", 19, 5);

        Player robot1 = new Robot("R2", 100, 20);
        Player robot2 = new Robot("Neo", 85, 18);

        Player[] players = {cat1, cat2, human1, human2, robot1, robot2};
        System.out.println("На спортивную дистанцию вышли 6 игроков");

        Hurdles wall1 = new Wall(16);
        Hurdles wall2 = new Wall(9);

        Hurdles racecourse1 = new Racecourse(15);
        Hurdles racecourse2 = new Racecourse(21);

        Hurdles[] hurdles = {wall1, wall2, racecourse1, racecourse2};


            for (Player player : players) {
                for (int i = 0; i < hurdles.length; i++){

                 if
                 (!hurdles[i].check(player)) {
                     break;
                }
            }
        }
    }
    }