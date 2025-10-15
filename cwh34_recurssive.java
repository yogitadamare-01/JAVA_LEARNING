package com.company;

public class cwh34_recurssive {
    static int factorial(int n)
    {
        int fact;
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
             fact=n*factorial(n-1);
        }
        return fact;
    }
    static int factorial_iterative(int n)
    {
        int result=1;
        if(n==0||n==1)
        {
            return 1;
        }
        else {
            for(int i=1;i<=n;i++)
            {
                result *=i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("the factorial of 5 is " + factorial(5));
        System.out.println("the factorial of 5 is " + factorial_iterative(5));
    }
}
