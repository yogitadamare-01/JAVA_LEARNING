package com.company;
import java.util.Scanner;

public class cwh21_loops {
    public static void main(String[] args) {
        //while loop
//        System.out.println("print natural numbers from 100 to 200");
//        int i=100;
//
//       while(i<=200)
//       {
//           System.out.println(i);
//           i++;
//       }
        //do while loop
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the n natural numbers using do while loop");
//        int n=sc.nextInt();
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=n);

        //for loop increment

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter first n natural numbers");
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++)
//        {
//            System.out.println(2*i+1);
//        }

        //for loop decrement
        Scanner sc=new Scanner(System.in);
        System.out.println("print n natural no.s in reverse order");
        int n= sc.nextInt();
        for(int i=n ;i!=0;i--)
        {
            System.out.println(i);
        }

    }
}
