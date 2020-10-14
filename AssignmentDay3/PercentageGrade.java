package com.LetsUpgrade;

import java.util.Scanner;

public class PercentageGrade {
    public void Question1(){
        int Eng,Phy,Math,Chem,Bio;
        float Percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter English marks:");
        Eng=sc.nextInt();
        System.out.println("Enter Physics marks:");
        Phy=sc.nextInt();
        System.out.println("Enter Maths marks:");
        Math=sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        Chem=sc.nextInt();
        System.out.println("Enter Biology marks:");
        Bio=sc.nextInt();

        int Total=Eng+Phy+Math+Chem+Bio;
        Percentage=Total*100/500;

        if(Percentage>70 && Percentage<=100){
            System.out.println("Your Grade: 'A' ");
            System.out.println("Your Percentage: "+Percentage);
        }
        else if(Percentage>50 && Percentage<=70){
            System.out.println("Your Grade: 'B' ");
            System.out.println("Your Percentage: "+Percentage);
        }
        else if(Percentage>40 && Percentage<=50){
            System.out.println("Your Grade: 'C' ");
            System.out.println("Your Percentage: "+Percentage);
        }
        else{
            System.out.println("Your Grade: 'Failed' ");
            System.out.println("Your Percentage: "+Percentage);
        }
    }
}
