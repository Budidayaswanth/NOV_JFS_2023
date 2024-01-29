package JSL_2014_Interview.String;

import java.util.Scanner;

public class MemberShipCard_BillingAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enther the Bill Amount :");
    int billamount= sc.nextInt();
        System.out.println("do have MemberShip :");
    String Membership=sc.next();
    int dicount=0;
    if(Membership.equals("yes")){
        dicount=billamount-500;
        System.out.println("Thank you! Your total bill amount is Rs "+billamount+",discount is Rs 500 and net amount payable is Rs "+dicount);
        }

    else if (Membership.equals("no")) {
        dicount=billamount-150;
        System.out.println("Thank you! Your total bill amount is Rs "+billamount+",discount is Rs 150 and net amount payable is Rs "+dicount);
    }
    }
}
