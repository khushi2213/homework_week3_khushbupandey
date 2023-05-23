package homework;
/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class AlphabetProgram8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AlphabetProgram8 pr = new AlphabetProgram8();
        pr.alphabet();
    }

    public static void alphabet() {

        System.out.println("Enter city name");
        char ch = sc.next().charAt(0);

        if (ch == 'A') {
            System.out.println("City name is Amritsar");

        } else if (ch == 'B') {
            System.out.println(" City name is : Belfast");

        } else if (ch == 'C') {
            System.out.println(" City name is : Chennai");

        } else if (ch == 'D') {
            System.out.println(" City name is : Delhi");

        } else if (ch == 'E') {
            System.out.println(" City name is : Eureka");

        } else if (ch == 'F') {
            System.out.println(" City name is : Frankfort");

        } else {
            System.out.println("Invalid data");

        }


    }
}

