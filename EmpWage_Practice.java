package com.OopsConcept;

public class EmpWage_Practice {
    public static void main(String[] args) {

        //UC2

        //to calculate daily wage


        //constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        //VARIABLES
        int empHrs = 0;
        int empWage = 0;
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
           empHrs = 8;
        else
            empHrs = 0;
            System.out.println("Employee wage :" + empWage);

    }



}
