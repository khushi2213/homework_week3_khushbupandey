package homework;
/**9. Input any alphabet from “A" to “F” and print their city name accordingly (use  switch) if
 any other alphabet should be invalid entry
 */

import java.util.Scanner;
public class AlphabetProgram9 {
    public void cityName(String alphabet) {
        switch (alphabet) {
            case "A":
                System.out.println("City name is Amritsar");
                break;
            case "B":
                System.out.println(" City name is : Belfast");
                break;
            case "C":
                System.out.println("City name is : Chennai");
                break;
            case "D":
                System.out.println("City name is : Delhi");
                break;
            case "E":
                System.out.println(" City name is : Eureka");
                break;
            case "F":
                System.out.println(" City name is : Frankfort");
                break;
            default:
                System.out.println("Invalid data");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one alphabet from A to F");
        String name = sc.nextLine();
        AlphabetProgram9  obj = new AlphabetProgram9();
        obj.cityName(name);
    }
}
