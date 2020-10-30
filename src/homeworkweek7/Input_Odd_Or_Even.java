/*Write a java program that tell us that Input Number is Odd or Even?
HINT: use ternery operator(?:)
 */
package homeworkweek7;

import java.util.Scanner;

public class Input_Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);

    }

}
