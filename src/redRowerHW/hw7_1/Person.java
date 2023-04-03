package redRowerHW.hw7_1;


import java.sql.Array;
import java.util.ArrayList;

public class Person {

ArrayList<String> arr = new ArrayList<String>();
    String[] array = {"Привет", "всем", "кто", "изучает", "язык", "программирования", "java"};
    String[] array1 =  null;


    public void sum (int a, int b){
        int d = a+b;
        System.out.println(d);
    }

    public void lis(ArrayList arr){
        for (int i = 0; i < arr.size() ; i++) {
            System.out.println(arr.get(i));
        }
    }
    public void lis1( String arr[]){
        if (arr==null ){
            System.out.println("null");
        }
        try {
            for (String s : arr) {
                System.out.println(s);
            }
        }catch (Exception ex){
            System.out.println(ex);
            System.out.println("its null");
        }

    }
}
