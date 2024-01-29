package Nov_class_practice;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the N Value is :");
        int N = sc.nextInt();
        if(N%2==0){
            System.out.println(N+"It Is a Even Number");
        }
        else {
            System.out.println(N+"It is a Odd Number");
        }
    }
}
