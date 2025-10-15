package com.company;

public class cwh24_break_continue {
    public static void main(String[] args) {

//        System.out.println("enter the numbers");
//        for(int i=1;i<=10;i++)
//        {
//            if(i==5)
//            {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("break is executed at 5");
        System.out.println("enter the numbers");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("continue statement is executed at 5");
    }
}
