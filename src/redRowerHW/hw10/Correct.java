package redRowerHW.hw10;

import java.util.Arrays;

public class Correct {

    public static void main(String[] args) {

        String s = "IF-RUDYARD KIPLING";
        System.out.println(correct(s));
        System.out.println(reverseWords(s));
        String how = "5 years old.";
        System.out.println(howOld(how));
    }

    public static String correct(String string) {
        String str = string.replace('1', 'I')
                .replace('0', 'O')
                .replace('5', 'S');
        return str;
    }

    public static String reverseWords(String str) {
        String[] st = str.split(" ");
        String[] answer = new String[st.length];
        int k = 0;
        for (int i = st.length - 1; i >= 0; i--, k++) {
            System.out.println(st[i]);
            answer[k] = st[i];
        }
        return String.join(" ", answer);
    }

    public static int howOld(final String herOld) {
         // String  herOld1 = Arrays.toString(herOld.split(" "));
        int answ = Integer.parseInt(herOld.split(" ")[0]);
        //your code here, return correct age as int ; )
        return answ;
    }
}
