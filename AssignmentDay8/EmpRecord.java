package com.LetsUpgrade;
import java.util.Scanner;
public class EmpRecord {
    String name,desig;
    int age;
    float salary;
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter Employ Name:");
        name=sc.nextLine();
        System.out.println("Enter Employ Designation:");
        desig=sc.nextLine();
        System.out.println("Enter Employ Age:");
        age=sc.nextInt();
        System.out.println("Enter Employ Salary:");
        salary=sc.nextFloat();
    }
    public void displayDetails(){
        System.out.println("----employee----");
        System.out.println("Employ Name  : "+name);
        System.out.println("Employ Age   : "+age);
        System.out.println("Designation  : "+desig);
        System.out.println("Salary(lakhs): "+salary);
    }
}
class doctor extends EmpRecord{
    doctor(){
        desig="Doctor";
    }
    String spec;
    public void getDetails(){
        System.out.println("Add Doctor Details");
        System.out.println("Enter Employ Name:");
        name=sc.nextLine();
        System.out.println("Enter Employ Age:");
        age=sc.nextInt();
        System.out.println("Enter Employ Salary:");
        salary=sc.nextFloat();
        spec=sc.nextLine();
        System.out.println("Enter Specialization: ");
        spec=sc.nextLine();
    }

    public void displayDetails(){
        System.out.println("------doctors------");
        System.out.println("Employ Name  : "+name);
        System.out.println("Employ Age   : "+age);
        System.out.println("Designation  : "+desig);
        System.out.println("Salary(lakhs): "+salary);
        System.out.println("Specialization in "+spec);
    }

}
class engineer extends EmpRecord{
    engineer() {
        desig = "Engineer";
    }
    String spec;
    public void getDetails(){
        System.out.println("Add Engineer details");
        System.out.println("Enter Employ Name:");
        name=sc.nextLine();
        System.out.println("Enter Employ Age:");
        age=sc.nextInt();
        System.out.println("Enter Employ Salary:");
        salary=sc.nextFloat();
        spec=sc.nextLine();
        System.out.println("Enter Specialization: ");
        spec=sc.nextLine();
    }

    public void displayDetails(){
        System.out.println("------engineers------");
        System.out.println("Employ Name  : "+name);
        System.out.println("Employ Age   : "+age);
        System.out.println("Designation  : "+desig);
        System.out.println("Salary(lakhs): "+salary);
        System.out.println("Specialization in "+spec);
    }
}
class pilot extends EmpRecord{
    pilot(){
        desig="Pilot";
    }
    String spec;
    public void getDetails(){
        System.out.println("Add Pilot Details");
        System.out.println("Enter Employ Name:");
        name=sc.nextLine();
        System.out.println("Enter Employ Age:");
        age=sc.nextInt();
        System.out.println("Enter Employ Salary:");
        salary=sc.nextFloat();
        spec=sc.nextLine();
        System.out.println("Enter Specialization: ");
        spec=sc.nextLine();
    }

    public void displayDetails(){
        System.out.println("-------Pilots-------");
        System.out.println("Employ Name  : "+name);
        System.out.println("Employ Age   : "+age);
        System.out.println("Designation  : "+desig);
        System.out.println("Salary(lakhs): "+salary);
        System.out.println("Specialization in "+spec);
    }

}
