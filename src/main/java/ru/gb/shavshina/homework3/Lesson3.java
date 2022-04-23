package ru.gb.shavshina.homework3;

public class Lesson3 {

    public static void main(String[] args) {
// Первая задача
        int[] arr = {0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                            } else {
                arr[i] = 1;
            }
            System.out.printf("%2d", arr[i]);
        }
        System.out.println();
        System.out.println();
//Вторая задача
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
//Третья задача
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) {
                b[i] = b[i] * 2;
            }
            System.out.print(b[i] + " ");
        }
        System.out.println();
//Четвёртая задача
       int x = 9;
        int[][] c = new int[x][x];

        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < x; j++) {

              if (i == j || i + j == x - 1) {
                  c[i][j] = 1;
              }
              else {
                  c[i][j] = 0;
              }
                System.out.print(c[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
//Шестая задача
        int [] arr1 = {0, 1, 4, 10, 19, - 100, 100, 88};
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > max)
                max = arr1[i];
            if (arr1[i] < min)
                min = arr1[i];
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
        System.out.println();

        printArray(array(7,7));

    }
//Пятая задача
      public static int [] array(int len, int initialValue) {
        int[] d = new int[len];

        for (int i = 0; i < d.length; i++) {
            d[i] = initialValue;
        }
        return d;
            }
    public static void printArray(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

    }

}


