// Details about program in link below @ local machine
// C:\Users\arpan\OneDrive\Documents\get_days_in_m

package homeworkweek7;
/*YearMonth is an immutable date-time object that represents the combination of a year and month.
*Any field that can be derived from a year and month, such as quarter-of-year,
 can be obtained. ...
 * It is equivalent to the proleptic Gregorian calendar system, in which today's rules for leap years are applied
 for all time.
 */
import java.time.YearMonth;
import java.util.Scanner;

public class GetDaysInMonth<isLeapYear, answer1> {
    static int yearr;
    static boolean answer1;
    static int month;
    static int year;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to find Leap Year or Not : ");
        int yearr = sc.nextInt();
        boolean answer1 = isLeapYear(yearr);
        System.out.println(yearr + " isLeapYear : " + answer1);

        Scanner fetch = new Scanner(System.in);
        System.out.println("Enter Month 1-12 in Number to find out number of days in a month : ");
        int month = fetch.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month -1");
            return;
        }
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter Year to find out number of days in a month : ");
        int year = yr.nextInt();
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year -1");
            return;
        }

        YearMonth yearMonthObject = YearMonth.of(year, month);
        int days = yearMonthObject.lengthOfMonth();

        int printedMonth;

        switch (month) {
            case 1:
                printedMonth = 1;
                break;
            case 2:
                printedMonth = 2;
                break;
            case 3:
                printedMonth = 3;
                break;
            case 4:
                printedMonth = 4;
                break;
            case 5:
                printedMonth = 5;
                break;
            case 6:
                printedMonth = 6;
                break;
            case 7:
                printedMonth = 7;
                break;
            case 8:
                printedMonth = 8;
                break;
            case 9:
                printedMonth = 9;
                break;
            case 10:
                printedMonth = 10;
                break;
            case 11:
                printedMonth = 11;
                break;
            case 12:
                printedMonth = 12;
                break;
            default:
                printedMonth = -1;
                break;
        }
        System.out.println(days);
    }


    public static boolean isLeapYear(int year) {
        if ((yearr >= 1 && yearr <= 9999) && ((yearr % 400 == 0) || (yearr % 4 == 0 && yearr % 100 != 0)))
            return true;
        else return false;

    }

}










