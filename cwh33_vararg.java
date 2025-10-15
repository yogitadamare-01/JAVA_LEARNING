package com.company;

public class cwh33_vararg {
    static int sum(int...arr)//it works as an array
    {
         int result=0;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the addition of 0 nos is:" + sum());
        System.out.println("the addition of 45 ,67 and 56 is" + sum(45,67,56));
        System.out.println("addition of multiple nos is:"+ sum(23,45,34,89,67));
    }
}
