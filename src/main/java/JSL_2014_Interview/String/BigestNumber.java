package JSL_2014_Interview.String;

import java.util.Scanner;

public class BigestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1 :");
        int num1= sc.nextInt();
        System.out.println("enter the num2 :");
        int num2= sc.nextInt();
        if(num1<=num2){
            System.out.println("The bigger of the two numbers entered ( "+num1+" and "+num2+" ) is :"+num2);
        }
        else {
            System.out.println("The bigger of the two numbers entered ( "+num1+" and "+num2+" ) is :"+num1);
        }
    }
}
