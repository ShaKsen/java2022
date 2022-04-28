package ru.gb.shavshina;

import ru.gb.shavshina.homework5.Employee;



public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Shamak Marina", "Manager", "m.shamak@mail.ru", "80295486618", 4000, 45);
        emp[1] = new Employee("Artem Pivovarov", "Head of security", "angry666@mail.ru", "80336660101", 8000, 48);
        emp[2] = new Employee("Ivan Nazarov", "Security", "big0109@mail.ru", "80445321489", 1500, 25);
        emp[3] = new Employee("Spitsova Alisa", "Administrator", "alicewonder@mail.ru", "80258954578", 1600, 22);
        emp[4] = new Employee("Tarasova Oksana", "Cashier", "oksi7654@mail.ru", "80291256987", 1400, 29);
        for (Employee e : emp) {
            if (e.getAge() > 40) {
                e.printInfo();
            }


        }
    }
}
