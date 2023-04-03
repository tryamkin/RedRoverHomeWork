package redRowerHW.hw4;

public class Task {
    public static void main(String[] args) {
        int number = 9;
        int start = 1;
        while (start * start < number){
            start++;
        }
        System.out.println(start + " after while");
        if (number == start*start) {
            System.out.println(start + " == ");
        }else if ((start*start - number) < (number-(start -1)*(start -1))) {
            System.out.println(start * start );
        }else  {
            System.out.println((start-1) * (start -1)   + " result");
        }
    }
}
