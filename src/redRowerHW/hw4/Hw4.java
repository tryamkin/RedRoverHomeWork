package redRowerHW.hw4;

public class Hw4 {
    public static void main(String[] args) {
  /*      Задача №1
        Необходимо вывести числа от 0 до 15.*/
        System.out.println("Задача №1");
        boolean finish = false;
        int i = 0;
        while (!finish) {
            System.out.printf(String.valueOf(i));
            if (i == 15) {
                finish = true;
            }
            i++;
        }
        System.out.println();
        System.out.println("Задача №2");
/*       Задача №2
        Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.*/

        int number = 5;
        int result = 1;
        for (int j = 1; result < 1000 ; j++) {
            result*=number  ;
            System.out.println("Number " + number + " in the degree " + j+ " = " + result );
        }

        // 2 variant
        System.out.println("Задача №2 - 2 variant");
        int base = 5;
        int exponent = 1;
        int result1 = base;
        while (result1 < 10000) {
            System.out.println(base + " в степени " + exponent + " = " + result1);
            exponent++;
            result1 *= base;
        }

       /* Задача №3
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
                Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).*/

        Hw4_1 hw41 = new Hw4_1();
        hw41.solution();
        hw41.solution2();

    }
}
