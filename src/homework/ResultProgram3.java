package homework;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * <p>
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class ResultProgram3 {
    public static void main(String[] args) {
        result();
    }

    public static void result() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name :   ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number  :  ");
        int a = sc.nextInt();
        System.out.println("Enter Maths Marks  :  ");
        int maths = sc.nextInt();
        if (maths >= 100) {
            System.out.print("Invalid Input. Marks should be between 0 tp 100");
            System.exit(maths);
        }

        System.out.println("Enter Science Marks  :  ");
        int sci = sc.nextInt();
        if (sci >= 100) {
            System.out.println("Invalid Input. Marks Marks should be between 0 tp 100");
            System.exit(sci);
        }

        System.out.println("Enter English Marks  :  ");
        int eng = sc.nextInt();
        if (sci >= 100) {
            System.out.println("Invalid Input. Marks Marks should be between 0 tp 100");
            System.exit(eng);
        }

        int sum = maths + sci + eng;
        float per = (sum * 100) / 300;

        int average = (sum * 100) / 300;
        String grade;
        String result;

        if (maths >= 35 && sci >= 35 && eng >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        if (average >= 80 && result == "Pass") {
            grade = "A+";
        } else if (average >= 60 && result == "Pass") {
            grade = "A";
        } else if (average >= 50 && result == "Pass") {
            grade = "B";
        } else if (average >= 35 && result == "Pass") {
            grade = "C";
        } else {
            grade = "";
        }

        System.out.println(" _______________________________");
        System.out.println("|                              |");
        System.out.println("|        Mark Sheet            |");
        System.out.println(" _______________________________");
        System.out.println("|    Name  :" + name + "       |");
        System.out.println("|  Roll No  " + a + "          |");
        System.out.println(" _______________________________");
        System.out.println("|  Subject  :    Marks         |");
        System.out.println(" _______________________________");
        System.out.println("|    Maths  :" + maths + "     |");
        System.out.println("|    Science  :" + sci + "     |");
        System.out.println("|    English  :" + eng + "     |");
        System.out.println(" _______________________________");
        System.out.println("|    Total  :" + sum + "       |");
        System.out.println(" _______________________________");
        System.out.println("| Percentage :" +per + "       |");
        System.out.println("| Result     :  " + result +"  |");
        System.out.println("|  Grade     : "   +grade +  " |");
        System.out.println(" _______________________________");
    }
}
