package codewars.abbreviateaTwoWordName;

public class AbbreviateTwoWords {

    public static void main(String[] args) {

        String test = "Sam Harris"; // для проверки
        String toint = "123";
        System.out.println(Integer.parseInt(toint));
        String remote = "eloquent";
        System.out.println(remote.substring(1,remote.length()-1));
        Overload overload = new Overload();
        System.out.println(overload.hashCode());

        abbrevName(test);
    }

    public static String abbrevName (String name){
        char[] chars = name.toUpperCase().toCharArray(); // переводим String в массив char
        char first = chars[0]; // инициализируем первый символ
        char end = chars[0]; // инициализируем последний символ
        String space = " "; // инициализируем для сравнения
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]); // просто для себя выводим что поулчилось
            if (space.matches(String.valueOf(chars[i]))){ //находим пробел
                // тут приведение к char to String для сравнения
                end=chars[i+1]; //присваеваем следующий элемент
            }
        }
        System.out.println(); //отступ вниз тк 19я строка - print
        System.out.println(first + "." + end); // вывод для себя
        return first + "." + end;
    }
}
