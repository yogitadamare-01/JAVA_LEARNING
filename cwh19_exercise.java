package com.company;
import java.util.Scanner;
public class cwh19_exercise {
    public static void main(String[] args) {
        //question 2
float tax=0;
float income;
Scanner sc=new Scanner(System.in);
        System.out.println("enter the income");
        income= sc.nextFloat();
        if(income<2.5f)
        {
            tax=tax+0;
        }
            else if(income>2.5f && income<=5.0f)
        {
            tax = tax+0.05f*(income-2.5f);

        }
            else if(income>5.0f && income<=10.f)
        {
            tax = tax+0.05f*(5f-2.5f);
            tax = tax+0.2f*(income-5f);
        }
        else if(income>10f)
        {
            tax = tax+0.05f*(5f-2.5f);
            tax = tax+0.2f*(10f-5f);
            tax =tax+0.3f*(income-10f);
        }
        System.out.printf("the tax on the person income is %f",tax);

    }
}
