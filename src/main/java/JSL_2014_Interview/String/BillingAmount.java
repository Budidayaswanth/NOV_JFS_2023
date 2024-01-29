package JSL_2014_Interview.String;

import java.util.Scanner;

public class BillingAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bill Amount :");
        int billAmount= sc.nextInt();
        double discount =0;
        if(billAmount>6000){
            discount=billAmount*0.1;
        }
        else {
            System.out.println("The Net bill Amount is :"+billAmount);
        }
        double netbillAmount=billAmount-discount;
        System.out.println("The Net bill Amount is :"+netbillAmount);

    }
}
