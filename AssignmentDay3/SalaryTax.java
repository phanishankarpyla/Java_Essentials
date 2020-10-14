package com.LetsUpgrade;

import java.util.Scanner;

public class SalaryTax {
    public void Question2(){
        float salary;
        String name,dob;
        Scanner scc=new Scanner(System.in);
        System.out.println("\nEnter your name: ");
        name=scc.nextLine();
        System.out.println("Enter your DOB[format:date/month/year]: ");
        dob=scc.nextLine();
        System.out.println("Enter your Salary(in lakhs): ");
        salary=scc.nextFloat();
        int year=Integer.parseInt(dob.substring(6,10));
        int age=2020-year;
        if(salary>=5){
            float tax=salary*0.2f*100000;
            System.out.println("Your name is "+name+"\n Your age is "+age+"\n Your Salary is Rs "+salary+" lakhs\n Your Tax: Rs "+tax);
        }
        else if(salary<5 && salary>=3){
            float tax=salary*0.15f*100000;
            System.out.println("Your name is "+name+"\n Your age is "+age+"\n Your Salary is Rs "+salary+" lakhs\n Your Tax: Rs "+tax);
        }
        else if(salary<3 && salary>=2){
            float tax=salary*0.1f*100000;
            System.out.println("Your name is "+name+"\n Your age is "+age+"\n Your Salary is Rs "+salary+" lakhs\n Your Tax: Rs "+tax);
        }
        else{
            float tax=salary*0.05f*100000;
            System.out.println("Your name is "+name+"\n Your age is "+age+"\n Your Salary is Rs "+salary+" lakhs\n Your Tax: Rs "+tax);
        }
    }
}
