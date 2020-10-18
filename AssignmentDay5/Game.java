package com.LetsUpgrade;

import java.util.Scanner;

public class Game {
    public void Gaming(){
        Scanner sccc=new Scanner(System.in);
        System.out.println("Enter your name:");
        Player one=new Player();
        one.name=sccc.nextLine();
        Questions[] asking=new Questions[3];
        for(int i=0;i<3;i++){
           asking[i]=new Questions();
        }

        asking[0].question="Who is Batman?";
        asking[0].opt1="A human being";
        asking[0].opt2="An Alien";
        asking[0].opt3="An animal";
        asking[0].anscheck="a";

        asking[1].question="What are Batman Powers?";
        asking[1].opt1="No Powers";
        asking[1].opt2="Flying";
        asking[1].opt3="Super Strength";
        asking[1].anscheck="a";

        asking[2].question="What is batman's biggest strength?";
        asking[2].opt1="His bats in bat-cave";
        asking[2].opt2="His Technology";
        asking[2].opt3="His intelligence";
        asking[2].anscheck="c";

        for(int i=0;i<3;i++){
            System.out.println("Question-"+(i+1));
            asking[i].ask();
        }

        for(int i=0;i<3;i++){
            if (asking[i].ans.equals(asking[i].anscheck)){
                one.score += 5;
            }
            else{
                one.score -= 2;
            }
        }

        one.result();

    }

}
