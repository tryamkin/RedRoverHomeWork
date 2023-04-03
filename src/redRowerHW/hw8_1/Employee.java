package redRowerHW.hw8_1;

public class Employee {

   /* Задача №1
    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.*/

    public Employee(String name, int age, String sex, int salary_per_day) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary_per_day = salary_per_day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary_per_day() {
        return salary_per_day;
    }

    public void setSalary_per_day(int salary_per_day) {
        this.salary_per_day = salary_per_day;
    }
    public int getSalary (int days){
        return salary_per_day*days;
    }

    private String name ;
    private int age ;
    private String sex;
    private int salary_per_day;

}
