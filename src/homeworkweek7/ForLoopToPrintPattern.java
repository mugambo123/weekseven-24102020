/*18. Write a Java program to print the following grid
with 10 line using for loop.*/
package homeworkweek7;

public class ForLoopToPrintPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 14; j++) {
                System.out.print("- ");
            }
            System.out.println("");
        }
    }
}
