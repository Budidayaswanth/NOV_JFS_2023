package JSL_2014_Interview.String;

import java.util.Scanner;

public class Onlypositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1= sc.nextInt();
        System.out.println("Enter the Second Number :");
        int num2 =sc.nextInt();
        int result=Math.abs(num1-num2);
        System.out.println("The Result (Difference is) :"+result);
    }
}
