package redRowerHW.hw10_3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Solution {
    public static void main(String[] args) {
        String hi = "hi";
        String h = hi;
        for (int i = 0; i < 5-1; i++) {
           h += hi;
        }
        System.out.println(h);
        String test = "test";
        System.out.println(test.repeat(4));
    }
    public static String repeatStr(final int repeat, final String string) {
      if (repeat<=0) return "";
        StringBuilder h1 = new StringBuilder(string);
        h1.append(string.repeat(repeat - 1));
         return h1.toString();
    }
}


