package com.OopsConcept;

public class EmpWage_Practice {


    //UC7

    // refactor the cod using class method and compute employee wage


    //constants
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static int computeEmpWage() {

        //VARIABLES
        int empHrs = 0;
        int empWage = 0;
        ;
        int day = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        //computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0://IS_PART_TIME
                    empHrs = 4;
                    break;

                case 1://IS_FULL_TIME

                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " + empHrs);

        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("total emp wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }

}


