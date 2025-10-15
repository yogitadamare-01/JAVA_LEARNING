package com.company;
import java.util.Scanner;
public class cwh_18_else_if_switch_case {
    public static void main(String[] args) {
      /* int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        age=sc.nextInt();
       if(age>56)
        {
            System.out.println("you are experienced");
        }
        else if(age>48)
        {
            System.out.println("you are semi experienced");
        }
        else if(age>36)
        {
            System.out.println("you are not much more experienced");
        }
        else
        {
            System.out.println("you have not experience");
        }*/
   char var='s';
   switch (var)
   {
       case 'r':
           System.out.println("it is same with input");
           break;
       case'p':
           System.out.println("it is not same with input");
           break;
       case 's':
           System.out.println("it is near to same with input ");
           break;
           default:
           System.out.println("default");
   }
    }

}
