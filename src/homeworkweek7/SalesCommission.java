/*WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */
package homeworkweek7;

import java.util.Scanner;

public class SalesCommission {
    private static boolean salesAmount;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SalesId : ");
        int salesId = sc.nextInt();

        Scanner fetch = new Scanner(System.in);
        System.out.println("Enter Seller name : ");
        String sellerName = sc.next();

        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Basic Salary : ");
        int basicSalary = sb.nextInt();

        SalesCommission();

    }

    private static void SalesCommission() {
        Scanner am = new Scanner(System.in);
        System.out.println("Enter Sales Amount : ");
        int salesAmount = am.nextInt();
        if (salesAmount >= 50000) System.out.println("Sales Commission " + ((salesAmount * 35) / 100));
        else if(salesAmount >= 30000) System.out.println("Sales Commission " + ((salesAmount*20)/100));
        else if(salesAmount >= 20000) System.out.println("Sales Commission " + ((salesAmount*10)/100));
        else if(salesAmount >= 10000) System.out.println("Sales Commission " + ((salesAmount*5)/100));
        else {
            System.out.println("Sales Commission : " + ((salesAmount * 2) / 100));
        }


    }



}
