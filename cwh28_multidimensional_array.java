package com.company;

public class cwh28_multidimensional_array {
    public static void main(String[] args) {
        int[][]flats=new int[2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=203;
        //displaying the 2-D array
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<flats[i].length;j++)

            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
