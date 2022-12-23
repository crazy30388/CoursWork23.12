import java.util.Random;

public class Employee {
    private String FIO;
    private int Department;
    private int Salary;
    private static int Id;


    public int getId() {
        return this.Id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.Department;
    }

    public int getSalary() {
        return (int) this.Salary;
    }

    public void SetDepartment(int dept) {
        this.Department = dept;
    }

    public void SetSalary(float sal) {
        this.Salary = (int) sal;
    }

    public Employee(String fio, int dept, int salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id++;
    }

    @Override
    public String toString() {
        return "ФИО: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }
}
