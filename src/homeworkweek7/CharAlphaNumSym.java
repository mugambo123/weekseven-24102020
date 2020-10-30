//Write a program that tells us input value is number or an alphabet or symbol.
package homeworkweek7;

import java.util.Scanner;

public class CharAlphaNumSym {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.println("Enter any Alphabet or Number or Symbol");
        ch = in.next().charAt(0);
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println("Entered Character Is Alphabet");
        else if (ch >= 48 && ch <= 57)
            System.out.println("Entered Character Is Number");
        else
            System.out.println("Entered Character Is Symbol");
    }
}
