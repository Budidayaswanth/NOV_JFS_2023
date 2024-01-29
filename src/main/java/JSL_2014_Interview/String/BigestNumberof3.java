package JSL_2014_Interview.String;

import java.util.Scanner;

public class BigestNumberof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the First Number :");
        int num1= sc.nextInt();
        System.out.println("enter the Secound number ");
        int num2= sc.nextInt();
        System.out.println("enter the Thrid Number ");
        int num3= sc.nextInt();
        if (num1<num2 && num1<num3){
            System.out.println("Bigest  Secound Number is :"+num1);
        } else if (num2<num3) {
            System.out.println("Bigest  Thrid Number is :"+num2);
        }else {
            System.out.println("Bigest  first Number is :"+num3);
        }
    }
}
