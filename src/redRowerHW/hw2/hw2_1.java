package redRowerHW.hw2;

import redRowerHW.hw1.Hw1;

import java.util.Random;

public class hw2_1 {
    public static void main(String[] args) {
/*
        Задача №1

        Необходимо создать целочисленные переменные a и b, присвоить
        произвольные значения переменным на ваш выбор и вывести результаты следующих операций
        с этими переменными: сложение, умножение, вычитание, деление.
*/

        Random rn = new Random();
        int a = rn.nextInt(10) + 1;
        int b = rn.nextInt(10) + 1;
        System.out.println(a + " " + b );
        System.out.println("Sum " +a + " + " + b + " = " + a+b );
        System.out.println("Multy " +a + " * " + b + " = " + a * b );
        System.out.println("Minus " + a + " - " + b + " = " + (a - b) );
        System.out.println("Devide " + a + " / " + b + " = " +String.format("%.2f",(double)  a / b)  );


/*
        Экстра задача

        Также вывести остаток от деления и сделать проверку на четность этих переменных.
*/


        int remainder = a % b;
        System.out.println("Остаток от деления " + a + " на " + b + " равен " + remainder);
        odd(a);
        odd(b);

/*
        Экстра задача

        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).


*/


        System.out.println("\uD83D\uDE0A");

        Hw1 hw = new Hw1();
        hw.print();

    }
    public static void odd(int x){
        if (x % 2 == 0 ){
            System.out.println( x + " - even " );
        } else   System.out.println( x + " - odd  " );
    }



}
