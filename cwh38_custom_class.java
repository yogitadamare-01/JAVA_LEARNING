package com.company;
class Employee
{
    int id;
    String name;
    int salary;
    public void getdata() {
        System.out.println("the id of the employee is " + id);
        System.out.println("the name of the employee is " + name);
    }
    public int get_salary()
    {
        return salary;
    }
}

public class cwh38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is the custom class");
        Employee yogita=new Employee(); //creating new employee object
        yogita.id=17;
        yogita.name="YogitaDamare";
        yogita.salary=40000;

        Employee riya=new Employee(); //creating new employee object
        riya.id=15;
        riya.name="riyagatagat";
        riya.salary=50000;

        //System.out.println(yogita.id);
        //System.out.println(yogita.name);
        yogita.getdata();
        int salary=yogita.get_salary();
        System.out.println(salary);
        riya.getdata();
        int payment=riya.get_salary();
        System.out.println(payment);
    }
}
