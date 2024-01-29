package Nov_class_practice;

import java.util.Scanner;

public class PrimeNumberinRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the lower boundary");
         int lb= sc.nextInt();
        System.out.println("enter the upper boundary");
         int ub= sc.nextInt();
         int count =0;
        while(ub >=lb){
             if( % lb==0){
                 System.out.println("Prime Number "+ub);
                 count--;
             }
        }
    }
}
