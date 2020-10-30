//With && || short cut to find leap year
package homeworkweek7;

public class LeapYear1 {
    public static void main(String[] args) {
        int year = 2021;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");


        }
    }
}
