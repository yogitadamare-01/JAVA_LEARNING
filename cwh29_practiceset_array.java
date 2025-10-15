package com.company;
import java .util.Scanner;
public class cwh29_practiceset_array {
    public static void main(String[] args) {


        //1st Question
//        float []no={10.4f,20.4f,23.6f,40.4f};
//        float sum=0;
//        for(int i=0;i<no.length;i++)
//        {
//            sum=sum+no[i];
//        }
//
//       System.out.printf("the sum of the array is %.2f",sum );
//       int[]no={30,40,20,50,60};
 /*      int h=30;
        boolean isinarray=false;
        for(int i=0;i<no.length;i++)
        {
           if (h == no[i])
           {
               isinarray=true;
           }

        }
        if (isinarray)
        {
            System.out.println("given element is present in array");

        }
        else
        {
            System.out.println("the given element is not present in tne array");
        }

        // problem no 3
        int[]arr={10,20,30,40,50,60,70,80,90};
        int sum=0;
     for (int element:arr)
     {
         System.out.println(element);
         sum=sum+element;

     }
        System.out.printf("the sum of marks of physics of all student is %d",sum);
     float avg=sum/9;
        System.out.printf("the average of marks of physics of all student is %.2f",avg);

        // problem no 5
        String[]arr={"A","B","C","D","E","F","G","H"};
        System.out.println("the reversed array is");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

        //Problem no 6
        int[]arr={10,20,30,40,50,60,70,80,90};
        int max=0;
        System.out.println("maximum no is");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);


        int[]arr={40,20,-30,40,-20,60,70,80,-90};
        int min=arr[0];
        System.out.println("minimum  no is");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
*/
        int[]arr={10,20,30,40,50,60, 70,80};
        boolean b=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if (arr[i] > arr[i + 1] )
            {
                b=false;
                break;
        }
        }
        if(b)
        {
            System.out.println("array is sorted");
        }
        else
        {
            System.out.println("the array is not sorted");
        }





    }
}

