/* Write a Java program to sort a numeric array and a string
array.*/
package homeworkweek7;

import java.util.Arrays;

public class SortNumArray {
    public static void main(String[] args) {
        int [] arraydata1  =


{44,50,90,78,89,150,700,5000,99, 10, 5,20,2,1};
        String[] arraydata2 = {"raam","shyam","ghanshyam","david","boris","trump" };
        System.out.println("Original value: "+ Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted Value : "+ Arrays.toString(arraydata1));

        System.out.println("Original value: "+ Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("Sorted Value : "+ Arrays.toString(arraydata2));
    }}