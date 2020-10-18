package com.LetsUpgrade;

import java.util.Scanner;

public class Questions {
    Scanner sc=new Scanner(System.in);
    public String question,opt1,opt2,opt3,ans,anscheck;
    public void ask(){
        System.out.println(question);
        System.out.println("    a)"+opt1);
        System.out.println("    b)"+opt2);
        System.out.println("    c)"+opt3);
        System.out.println("Enter your option(a/b/c)");
        ans=sc.nextLine();
    }
}
