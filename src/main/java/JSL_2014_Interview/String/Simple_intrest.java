package JSL_2014_Interview.String;

import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Principal Amount is :");
        int PrincipalAmount= sc.nextInt();
        System.out.println("enter the rate of intrest is :");
        double rateintrest= sc.nextDouble();
        System.out.println("enter the Year :");
        double year=sc.nextDouble();
        double SI=(PrincipalAmount*rateintrest*year)/100;
        double ti=PrincipalAmount*SI;
        System.out.println("the Simple Intreset is :"+SI);
        System.out.println("the toatal amount is :"+ti);
    }
}
