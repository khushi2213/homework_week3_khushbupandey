package homework;
//6.Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class EvenOddProgram6 {
    public static void main(String[] args) {
        evenOdd();
    }


    public static void evenOdd() {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

}

