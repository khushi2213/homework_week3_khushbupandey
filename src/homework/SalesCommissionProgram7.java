package homework;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class SalesCommissionProgram7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        commission();
    }

    public static void commission() {
        System.out.println("Enter sales id:   ");
        int id = sc.nextInt();
        System.out.println("Enter Seller's name:   ");
        String name = sc.nextLine();
        System.out.println("Enter amount:   ");
        double amount = sc.nextInt();
        System.out.println("Enter Basic Salary:   ");
        double sal = sc.nextInt();
        double commission = 0;
        int rate =0;

        if (amount >= 50000) {
            rate = 35;
            commission = amount * 0.35;
        }
        if (amount >= 30000 && amount <= 20000) {
            rate = 20;
            commission = amount * 0.2;
        }
        if (amount >= 20000 && amount <= 10000) {
            rate = 10;
            commission = amount * 0.1;
        }

        if (amount >= 10000 && amount <= 10000) {
            rate = 10;
            commission = amount * 0.05;
        }
        if (amount < 10000) {
            rate = 2;
            commission = amount * 0.02;
        }
        System.out.println("Commission Amount=" + commission);
    }
}


