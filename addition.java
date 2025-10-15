package com.company;
import java.util.Scanner;
public class addition
{

    public static void main(String[]args)
    {System.out.println("take two inputs");
       Scanner sc= new Scanner(System.in);
       System.out.println("the 1st no is");
       int a = sc.nextInt();
       System.out.println("the 2nd no. is");
       int b=sc.nextInt();
       int sum= a+b;
       System.out.println("the sum is");
       System.out.println(sum);

    }
}
