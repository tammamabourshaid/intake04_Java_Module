package Refliction.Refliction_181219;

public class Employee {

    private String name;
    private String department;
    private String salary;

    public Employee(String name, String department, String salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "{name : " + name +
                " | department : " + department +
                " | salary : " + salary +
                '}';
    }
}
