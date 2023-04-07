package redRowerHW.hw10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(4)));
        System.out.println(Arrays.toString(reverse1(6)));
    }


    public static int[] reverse(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    static int[] reverse1(int n) {
        return IntStream.iterate(n, i -> --i).limit(n).toArray();
    }


    public static String[] stringToArray(String s) {
        //your code;
        String[] words = s.split(" ");

        return words;
    }
}