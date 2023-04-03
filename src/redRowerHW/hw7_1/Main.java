package redRowerHW.hw7_1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();;
        person.sum(1,1);
        person.arr.add("hi");
        person.arr.add("hi1");
        person.arr.add("hi2");

     person.lis(person.arr);
        System.out.println(person.arr);
        person.lis1(person.array);
        person.lis1(person.array1);
    }
}
