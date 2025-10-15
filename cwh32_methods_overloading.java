package com.company;

public class cwh32_methods_overloading {
   // static void name() {
     //   System.out.println("my name is yogita Damare");

    //}

    //static void change(int a) {
      //  a = 34;
    //}

    //static void change1(int[] arr)
    //{
      //  arr[0]=90;
    //}
    static void foo()
    {
        System.out.println("good morning guyss");
    }
    static void foo(int a)
    {
        System.out.println("good morning " +a+ " guyss");
    }
        static void foo(int a,int b)
        {
            System.out.println("good " + a+" morning " +b+ " guyss");
        }



       public static void main(String[] args) {
       /* name();
        // changing the integer
        int a= 45;
        change(a);
       System.out.println(a);

       //changing the array
       int[] ch={1,2,3,4,5};
       change1(ch);
        System.out.printf("the change value of array is %d",ch[0]);
        */

           // METHOD OF OVERLOADING
           foo();
           foo(30);
           foo(10,40);

    }
}
