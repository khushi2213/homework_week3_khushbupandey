package homework;

//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class NumberAlphabetSymbolProgram12 {

    public static void main(String[] args) {
        value();
    }

    public static void value() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Values :");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a Number");
        } else {
            System.out.println("This is a Symbol");
        }
    }

}
