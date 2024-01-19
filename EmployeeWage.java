package com.bridgelabz.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args) {
        int FULL_TIME = 2;
        int Part_TIME = 1;
        int emphr=0,empwage=0;
        int wageperhr=20;
        int monthlywage=0;

        int noofday=20;
        for (int day = 0; day < noofday ; day++) {
            int empCheck =(int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:
                    emphr = 4;
                    break;
                case 2:
                    emphr = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    emphr = 0;
            }
            empwage=emphr*wageperhr;
            monthlywage=monthlywage+empwage;
        }
        /*if (empCheck == FULL_TIME)
            System.out.println("Employee is Present");
        else if (empCheck == Part_TIME)
         else
                */


        System.out.println("Emplyee wage for month ="+monthlywage);
    }
}
