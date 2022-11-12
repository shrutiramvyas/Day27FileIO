package javafileIopackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollClass {
    public enum IOService { FILE_IO }
    private List<EmployeePayrollData> employeePayrollDataList;

    EmployeePayrollClass(){}
    //default constructor
    public EmployeePayrollClass(List<EmployeePayrollData> employeePayrollDataList) {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    public void readUserInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scan.nextInt();
        System.out.println("Enter Employee name: ");
        String name = scan.next();
        System.out.println("Enter Salary: ");
        double salary = scan.nextDouble();
        employeePayrollDataList.add(new EmployeePayrollData(id,name,salary));
    }
    public void writeEmpInfo(){
        System.out.println( employeePayrollDataList);
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollClass emp = new EmployeePayrollClass(employeePayrollList);
        emp.readUserInfo();
        emp.writeEmpInfo();

    }
}
