package redRowerHW.hw7_2;

public class Salary {
//    Задача №3
//    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.*/

    public int getSum(Employee[] employeeArray){
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum+= new Integer(String.valueOf(employeeArray[i]));
        }
        return sum;
    }

}
