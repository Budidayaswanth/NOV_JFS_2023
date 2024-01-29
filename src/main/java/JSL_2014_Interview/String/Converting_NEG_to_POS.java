package JSL_2014_Interview.String;

import java.util.Scanner;

public class Converting_NEG_to_POS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number :");
        int Number=sc.nextInt();
        int absNum=Math.abs(Number);
        if(Number<0){
            System.out.println("the Result is: "+absNum);
        }
        else{
            System.out.println("the Result is: "+Number);
        }
    }
}
