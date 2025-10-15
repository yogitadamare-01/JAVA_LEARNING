package com.company;

public class cwh31_methods {
    int logic(int x, int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        cwh31_methods obj= new cwh31_methods();
        c= obj.logic(a,b);
        System.out.println(c);



        int a1=8;
        int b1=6;
        int c1;
        c1=obj.logic(a1,b1);
        System.out.println(c1);
    }
}
