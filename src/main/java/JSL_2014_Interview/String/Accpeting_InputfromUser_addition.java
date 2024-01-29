package JSL_2014_Interview.String;
import java.util.Scanner;
public class Accpeting_InputfromUser_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1 value :");
        int num1= sc.nextInt();
        System.out.println("enter the num2 value :");
        int num2= sc.nextInt();
        int sum =num1+num2;
        System.out.println("num1 is: " +num1 +"; num2 is: " +num2+"; sum of num1 and num2 is: " +sum);
    }
}
