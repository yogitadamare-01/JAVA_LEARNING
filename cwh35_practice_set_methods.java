package com.company;

import javax.imageio.stream.ImageInputStream;

public class cwh35_practice_set_methods {

    // 1st problem
    /* static void product(int n)
    {

        for(int i=1;i<=10;i++)
        {
            System.out.format("%d*%d=%d\n ",n,i,n*i);
        }

    }

    public static void main(String[] args) {
        product(7);

    // problem no 2nd
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.format("*");
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}

    // problem no 3rd
    static int sum(int n)
    {
        if(n==1) {
            return 1;
        }
        return n+sum(n-1);



    }

    public static void main(String[] args) {
        System.out.println("the addtion of n natural numbers is "+ sum(7));
    }
}


   //problem no 4th

static void pat1(int n){

    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

    public static void main(String[] args) {
        pat1(4);

    }
}
static int fibo(int n)
{
    if(n==1)
    {
        return 0;
    } else if (n==2) {
        return 1;
    }
    else{
        return fibo(n-1)+fibo(n-2);
    }
}

    public static void main(String[] args) {
    int result=fibo(5);
        System.out.println(result);

    }
}*/
    static float average(float... arr) {
        float result = 0;
       float avg = 1;
        for (float a : arr) {
            result += a;
            avg = result / arr.length;
        }
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("the average of given nos is" + average(36,42,67,5,6));

    }
}
