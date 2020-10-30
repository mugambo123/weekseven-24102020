//Wp input to find out odd or even number
package homeworkweek7;

import java.util.Scanner;

public class WapOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find out Odd or Even : ");
        int x = sc.nextInt();

        int remainder = x % 2;

        if (remainder == 1)
        {
            System.out.println("Odd Number");

        }
    else
        {
            System.out.println("Even Number");
        }
    }
}
