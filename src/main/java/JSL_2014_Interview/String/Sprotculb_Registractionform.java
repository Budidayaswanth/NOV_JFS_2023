package JSL_2014_Interview.String;

import java.util.Scanner;

public class Sprotculb_Registractionform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name= sc.nextLine();
        System.out.println("Enter the Mobile Number is :");
        long Number= sc.nextLong();
        System.out.println("enter the Age is: ");
        int Age = sc.nextInt();
        if(Age>18){
            System.out.println("Congratulations "+name+" for your successful registration.");
        }
        else{
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
        }
    }
}
