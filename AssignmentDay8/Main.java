package com.LetsUpgrade;

public class Main {

    public static void main(String[] args) {
        EmpRecord[] emp=new EmpRecord[3];
        emp[0]=new doctor();
        emp[1]=new engineer();
        emp[2]=new pilot();
        for (int i=0;i<3;i++){
            emp[i].getDetails();
        }
        for (int i=0;i<3;i++){
            emp[i].displayDetails();
        }

    }
}
