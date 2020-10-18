package com.LetsUpgrade;

import java.util.Scanner;

public class Player {
    public String name;
    public int score=0;
    Scanner scc=new Scanner(System.in);
    public void data(){
        System.out.println("Enter you name?");
        name=scc.nextLine();
    }
    public void result(){
        System.out.println("Your name is "+name);
        if(score>8){
            System.out.println("Your Score: "+score);
            System.out.println("Congo! You are a SuperFan");
        }
        else{
            System.out.println("Your Score: "+score);
            System.out.println("Batman is disappointed");

        }

    }

}
