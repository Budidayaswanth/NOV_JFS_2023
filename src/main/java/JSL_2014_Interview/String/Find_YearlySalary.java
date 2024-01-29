package JSL_2014_Interview.String;

import java.util.Scanner;

public class Find_YearlySalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee Name :");
        String EmpName= sc.nextLine();
        System.out.println("Enter the Employee ID Number :");
        int EmpNo= sc.nextInt();
        System.out.println("Enter the Employee Mountly salary :");
        int Empsalary= sc.nextInt();
        int yearsalary=Empsalary*12;
        System.out.println("HI "+EmpName+", Your Employee Id is: "+EmpNo+",Your Mountly Salary is: "+Empsalary+", Yearly Salary of the "+EmpName+" is :"+yearsalary+" LPA");
    }
}
