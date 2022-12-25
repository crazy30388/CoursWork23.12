import java.util.Random;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private static int Id;



    public int getId() {

        return this.Id;
    }

    public String getName() {

        return this.name;
    }

    public int getDepartment() {

        return this.department;
    }

    public int getSalary() {

        return this.salary;
    }

    public void setDepartment(int dept) {

        this.department = dept;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    public Employee(String name, int dept, int salary) {
        this.name = name;
        this.department = dept;
        this.salary = salary;
        Id++;
    }

    @Override
    public String toString() {
        return "ФИО: " + name + " Dept: " + department + " Salary: " + salary;
    }
}
