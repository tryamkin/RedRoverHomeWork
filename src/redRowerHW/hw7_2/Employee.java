package redRowerHW.hw7_2;

public class Employee extends Person {
//    Задача №2
//    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя
    public Employee(String name, int age, String sex) {
        super(name, age, sex);
    }
    private String name ;
    private int age ;
    private String sex;
    private int Salary;


    public boolean isSameName(Employee employee){
        if (employee.name.equals(name)){
            return true;
        }
        return false;
    }
}
