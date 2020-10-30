//Write a Java program to test if an array contains a specific value.
package homeworkweek7;

import java.util.Arrays;

import java.util.List;

public class TestArrayContains {


    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "B", "C"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        if (list.contains("A")) {
            System.out.println("Hello A");
        }

    }

}



