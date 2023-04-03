package redRowerHW.hw6;

import epam.Main;

import java.util.Arrays;

public class Hw6_1 {
    public static void main(String[] args) {
        Hw6_2 hw = new Hw6_2();

        /*        Задача №1

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.*/
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of el =" + sum);


      /*  Задача №2

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Max el =  " + max);

       /*         Задача №3

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.*/
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        System.out.println("Min el = " + min);

   /*             Задача №4

        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int summ = 0;
        for (int i = 0; i < array3.length; i++) {
            summ += array3[i];
        }
        double avg = (double) summ / array3.length;
        System.out.println(summ + " + lengh " + array3.length + " avg = " + avg);
     /*           Задача №5

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/

        task5();
 /*               Задача №6

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.*/
        task6();

    }

    private static void task5() {
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(Arrays.deepToString(array4));
        int s = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                s += array4[i][j];
            }
            System.out.println(" Sum elements of rows " + i + " =  " + s);
        }
        System.out.println(" Sum all elements of array4 = " + s);
    }

    public static void task6() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = Integer.MIN_VALUE;
// Проходим по всем строкам массива
        for (int i = 0; i < array.length; i++) {
            // Проходим по всем элементам строки
            for (int j = 0; j < array[i].length; j++) {
                // Если значение текущего элемента больше максимального, сохраняем его в переменную max
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

// Выводим максимальное значение массива
        System.out.println("Максимальное значение массива: " + max);
    }
}
