package com.company;

public class cwh_17_logical_operator {
    public static void main(String[] args) {
        boolean a = true;

        boolean b = false;
        if (a && b) {
            System.out.println("ans is false");
        } else {
            System.out.println("ans is true");

        }
        if(a || b)
        {
            System.out.println("t");
        }
        System.out.println(!a);
}}