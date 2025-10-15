package com.company;
import java.util.Scanner;
public class cwh19_exercise3 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        // Question 5
//        System.out.println("enter the Year");
//        int a=sc.nextInt();
//        if(a%4==0)
//        {
//            System.out.println("the given year is leap year");
//        }
//        else
//        {
//            System.out.println("the given year is not leap year");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the web");
        String website=sc.next();
        if(website.endsWith(".com"))
        {
            System.out.println("the name of the web is commercial website");

        }
        else if(website.endsWith(".org"))
        {
            System.out.println("the name of the the web is organization website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("the name of the web is indian website");
        }
        else
        {
            System.out.println("you are searching wrong website");
        }
    }
}
