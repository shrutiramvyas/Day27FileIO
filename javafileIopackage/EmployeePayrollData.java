package javafileIopackage;

public class EmployeePayrollData {
    int id;
    String name;
    double salary;
    public EmployeePayrollData(int id,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "id = " + id + ", name = " + name + '\''+ " salary =  " + salary;
    }
}
