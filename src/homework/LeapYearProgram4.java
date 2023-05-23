package homework;

/**
 * 4. Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
import java.util.Scanner;


public class LeapYearProgram4 {

        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            LeapYearProgram4 obj = new LeapYearProgram4();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Year :");
            int year = scan.nextInt();

            boolean isLeapYear = obj.isLeapYear(year);
            if(year>=9999 || year<1 )
            {
                System.out.println("Parameter is invalid");
            }
            else {
                System.out.println("This Leap Year : " + isLeapYear);
            }

            System.out.print("Enter Month :");
            int month = scan.nextInt();

            int dayOfMonth = obj.getDaysMonth(month, year);
            System.out.println("day Of Month : " + dayOfMonth);

        }

        public boolean isLeapYear(int year) {//instance method
            boolean validYear = year >= 1 && year <= 9999;
            if (validYear) {
                boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0);
                if (isLeapYear) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        public int getDaysMonth(int month, int year) {
            boolean validMonth = month >= 1 && month <= 12;
            boolean validYear = year >= 1 && year <= 9999;

            if (validMonth && validYear) {
                switch (month){
                    case 1:
                        return 31;
                    case 2:
                        boolean isLeapYear = isLeapYear(year);
                        if (isLeapYear) {
                            return 29;
                        } else {
                            return 28;
                        }
                    case 3:
                        return 31;
                    case 4:
                        return 30;
                    case 5:
                        return 31;
                    case 6:
                        return 30;
                    case 7:
                        return 31;
                    case 8:
                        return 31;
                    case 9:
                        return 30;
                    case 10:
                        return 31;
                    case 11:
                        return 30;
                    case 12:
                        return 31;
                }
            } else {
                return -1;
            }
            return -1;
        }
    }
