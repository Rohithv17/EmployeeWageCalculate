package com.bridgelabz.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args) {
        int FULL_TIME = 2;
        int Part_TIME = 1;
        int emphr=0,empwage=0;
        int wageperhr=20;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == FULL_TIME) {
            //System.out.println("Employee is Present");
            emphr=8;
        } else if (empCheck == Part_TIME) {
            emphr=4;
        } else  {
            System.out.println("Employee is Absent");
        }
        empwage=emphr*wageperhr;
        System.out.println("Employee wage for day:"+empwage);

    }
}
