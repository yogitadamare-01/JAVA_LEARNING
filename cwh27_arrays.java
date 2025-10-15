package com.company;

public class cwh27_arrays {
    public static void main(String[] args) {
       // int[]marks={100,67,45,89,90};
       // System.out.println(marks[0]);
        //double[]marks={89.4,24.5,38.9,67.8};
        //String[]students={"yogita","harry","riya","aditi"};
        //System.out.println(students[3]);
        int[]marks={100,67,45,89,90};
        //displaying array by using for loop
      System.out.println("printing using for loop");
        for(int i=0;i<marks.length;i++)
      {
          System.out.println(marks[i]);
      }
        //displaying array by using for loop in reverse order
        System.out.println("printing the array element reverse order");
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
           //  displaying array for each loop
            System.out.println("printing by using each loop");
            for(int element:marks)
            {
                System.out.println(element);
            }

        }
    }

