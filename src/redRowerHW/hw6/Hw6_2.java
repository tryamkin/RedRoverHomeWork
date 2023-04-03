package redRowerHW.hw6;

import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
@Data
@Getter
public class Hw6_2 {
    public static void main(String[] args) {
     /*   Задача №1

        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
                Для указанной строки ответ будет “ооооо” (или в столбик)*/
       task1();
  /*      Задача №2

        Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.

*/
        task2();
  /*      Задача №3

        Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                Для указанной строки ответ будет 6, 15, 29.
*/

        task3();
/*
        Экстра задача

        Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/

        extra1();
        extra2();
    }

    public static void extra2() {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        // String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (!array[i][j].contains("е")){
                    count++;
                }
            }
        }
        System.out.println(" количество строк в массиве, которые не содержат буквы “е” " + count);
    }

    private static void extra1() {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        // System.out.println(Arrays.deepToString(array));
        int count = 0; // счетчик строк без буквы "е"
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains("е")) {
               count++;

            }
            }
        }
        System.out.println("Количество строк c буквой 'е': " + count);
    }

    private static void task3() {
        String s = "Посмотрите как Рите нравится ритм".toLowerCase();
        s.toLowerCase();
        String target = "рит";
        int index = s.indexOf(target);
        while (index >= 0) {
            System.out.println(index);
            index = s.indexOf(target, index + target.length());
        }
    }

    private static void task2() {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i)=='е'){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void task1() {
        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print('о');
            }

        }
        System.out.println();
    }
}


