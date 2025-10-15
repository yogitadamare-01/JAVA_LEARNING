package com.company;
import java .util.Scanner;
public class cwh25_practise_set {
    public static void main(String[] args) {
//        int n=5;
        // problem1
//        for(int i=n;i>0;i--)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
        // problem 2
//        System.out.println("the addition of n even numbers");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=0;i<n;i++) //0 to n-1
//        {
//            sum=sum+(2*i);
//
//        }
//        System.out.printf("the sum of %d is %d",n,sum);
        //problem3
//        System.out.println("enter numbers");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=10;i++) // 1 to n
//        {
//            System.out.printf("  \n %d *%d=%d,",n,i,n*i);
//
//        }
        //problem4
//        System.out.println("enter numbers");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=10;i>=1;i--) //1 to n
//        {
//            System.out.printf("  \n %d *%d=%d,",n,i,n*i);
//
//        }

        //problem 5
//        System.out.println("enter number");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=n;i++) //1 to n
//        {
//            fact=fact*i;
//        }
//        System.out.printf("the factorialof %d is %d",n,fact);

        //problem 6
//        System.out.println("enter number");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i=1;
//        int fact=1;
//        while(i<=n)
//        {
//            fact=fact*i;
//
//            i++;
//        }
//        System.out.printf("the factorialof %d is %d",n,fact);

        //problem 9
        int n=8;
        int sum=0;
       for(int i=1;i<=10;i++) //1 to n
       {
           int c=n*i;
           sum=sum+c;
           System.out.printf("\n%d*%d=%d",n,i,n*i);

       }
        System.out.printf("the sum of the table of 8 is %d",sum);

    }
}
