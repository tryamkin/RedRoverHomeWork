package redRowerHW.hw8_1;

public class Manager {
   /* Задача №2
    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных. Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.
    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.*/

    private String name ;
    private int age ;
    private String sex;
    private int salary_per_day;
    private int sum_employee;

    public Manager(String name, int age, String sex, int salary_per_day, int sum_employee) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary_per_day = salary_per_day;
        this.sum_employee = sum_employee;
    }
    public double getSalary (int days){
        return  (salary_per_day*days * (getSum_employee()*0.01));
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

    public int getSum_employee() {
        return sum_employee;
    }

    public void setSum_employee(int sum_employee) {
        this.sum_employee = sum_employee;
    }


}
