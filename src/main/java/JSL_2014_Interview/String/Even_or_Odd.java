package JSL_2014_Interview.String;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the Number :");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("The Enter number "+number+" is Even");
        }
        else{
            System.out.println("The Enter number "+number+" is Odd");
        }
    }
}
