package redRowerHW.hw4;

public class Hw4_1 {
    /* Задача №3
 Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
 Реализовать 2 варианта:
 использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
 без использования конструкции if (шаг цикла на ваше усмотрение).*/
    int start = 40;
    int finish = 60;

    public void solution ( ){
        System.out.println("Задача №3");
        for (int i = start; i <= finish; i++) {
            if (i %4 == 0){
                System.out.println(i);
            }
        }
    }
    int i = start;
    public void solution2(){
        System.out.println("Задача №3 variant 2");
        while (i<=finish){
            System.out.println(i);
            i+=4;
        }
    }

}
