package com.LetsUpgrade;

import java.util.Scanner;

public class Avengers {
    Scanner sc=new Scanner(System.in);
    String name,age,power,weapons,planet;
    public void getDetails(){
        System.out.println("Enter the Avenger's name: ");
        name=sc.nextLine();
        System.out.println("Enter the Avenger's age: ");
        age=sc.nextLine();
        System.out.println("Enter the Avenger's power: ");
        power=sc.nextLine();
        System.out.println("Enter the Avenger's weapons: ");
        weapons=sc.nextLine();
        System.out.println("Enter the Avenger's planet: ");
        planet=sc.nextLine();
    }
    public void displayDetails(){
        System.out.println("Name is "+name+"\n Age is "+age+"\n Power is "+power+"\n Uses "+weapons+"\n Belongs to planet "+planet);
    }
}
