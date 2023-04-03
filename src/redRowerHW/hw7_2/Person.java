package redRowerHW.hw7_2;

public class Person {
//  /*  Задача №1
//    Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private String name ;
    private int age ;
    private String sex;

    public String getName() {
        if (sex.equals("Mr")){
            return "Mr, " + name;
        }
        return "Mrs, " + name ;
    }


//    Задача №3
//    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.*/


}
