package homeworkweek7;

//10. WAP to input any two number and ask user to enter their symbol (+, -, /, *) find addition,
//Subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;


public class Input2NumFindAdSubMulDiv {
    public static void main(String[] args) {
        double num1, num2;
        System.out.println("Enter numbers");// Enter any two numbers on which you wish to do operation
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter an operator to perform operation(+,-,*,/)"); /* Enter any operator to perform
        calculation like addition, subtraction, multiplication and division between num1 and num2 */
        char op = sc.next().charAt(0);
        double o;
        switch (op) {
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 - num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                return;
            default:
                System.out.println("You have entered wrong operator");
                return;

        }
        System.out.println(num1 + " " + op + " " + num2 + "=" + o);
    }
}
