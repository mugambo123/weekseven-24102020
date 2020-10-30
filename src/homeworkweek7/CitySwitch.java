//8. Input any alphabet from a to f and print their city name accordingly using switch statement
package homeworkweek7;

import java.util.Scanner;

public class CitySwitch {public static void main(String[] args) {
    PrintCityName();

}

    public static void PrintCityName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A to F to print City Name: ");
        String inputAlphabet = sc.next();

        switch (inputAlphabet) {
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Baroda");
                break;
            case "c":
                System.out.println("Cochin");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("El Pais");
                break;
            case "f":
                System.out.println("Florence");
                break;
            default:
                System.out.println("Invalid Entry");


                break;
        }

    }
}


