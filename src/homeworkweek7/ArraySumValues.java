/*Write a Java program to sum values of an
array*/
package homeworkweek7;

public class ArraySumValues {
    public static void main(String[] args) {
        int arr[] = {100, 50, 20, 10, 90, 5};
        int sum = 0;
        System.out.println("Sum of Arrays Elements are: ");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        {
            System.out.println(sum);
        }
    } }