package JSL_2014_Interview.String;

import java.util.Scanner;

public class Weight_of3persons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weight of the person1");
        float person1= sc.nextFloat();
        System.out.println("enter the weight of the person2");
        float person2= sc.nextFloat();
        System.out.println("enter the weight of the person3");
        float person3= sc.nextFloat();
        double Total_weight=person1+person2+person3;
        System.out.println("Total Weight of the 3 persons is : "+Total_weight);
        double avg_Weight=Total_weight/3;
        System.out.println("Average Weight of 3 persons is :"+avg_Weight);

    }
}
