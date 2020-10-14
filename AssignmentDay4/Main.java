package com.LetsUpgrade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
	// Question-1
        Avengers[] A=new Avengers[5];
        for(int i=0;i<5;i++){
            A[i]=new Avengers();
        }
        for(int i=0;i<5;i++){
            System.out.println("Avenger-"+(i+1));
            A[i].getDetails();
        }
        for(int i=0;i<5;i++) {
            System.out.println("Avenger-" + (i+1));
            A[i].displayDetails();
        }
    //Question-2
        int[] number=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter a number");
            number[i]=scc.nextInt();
        }
        System.out.print("The odd values are: " );
        for(int i=0;i<5;i++){
            if(number[i]%2!=0){
                System.out.print(number[i]+" ");
            }
        }
        System.out.println("\n");


    //Question-3
        int[] numbers=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter a number");
            numbers[i]=scc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=numbers[i];
        }
        System.out.println("The Sum is "+sum);

    }
}
