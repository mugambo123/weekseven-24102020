//Input any alphabet from a to f and print their city name accordingly (use if else) any other
//Alphabet should be invalid entry
package homeworkweek7;

import java.util.Scanner;

public class AToFCityAlphabet {
    public static void main(String[] args) {
        PrintCityName();

    }

    public static void PrintCityName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A to F to print City Name: ");
        String inputAlphabet = sc.next();

        if (inputAlphabet.equals("a"))
        System.out.println("Ahmedabad");

        else if (inputAlphabet.equals("b"))
        System.out.println("Baroda");

        else if (inputAlphabet.equals("c"))
        System.out.println("Cochin");

        else if (inputAlphabet.equals("d"))
        System.out.println("Delhi");

        else if (inputAlphabet.equals("e"))
        System.out.println("El Pais");

        else if (inputAlphabet.equals("f"))
        System.out.println("Florence");

        else {
            System.out.println("Invalid Entry");



    }

}
}
