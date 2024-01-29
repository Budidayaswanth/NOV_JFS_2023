package JSL_2014_Interview.String;

import java.util.Scanner;

public class Swapping_of_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1 value is ");
        int num1= sc.nextInt();
        System.out.println("enter the num2 value is ");
        int num2= sc.nextInt();
        System.out.println("Before swapping the values num1 is: "+num1+", and num2 is :"+num2);
        int temp =num1;
        num1=num2;
        temp=num1;
        //num1=num1+num2;
        //num2=num1-num2;
        //num1=num1-num2;
        System.out.println("After swapping the values num1 is: "+num1+", and num2 is :"+num2);
    }
}
