//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
package homeworkweek7;

public class OneToHunDivideByThree {
    static Integer i;
    static Integer a;



    public static void main(String[] args) {
        CanDivideByThree(); //method of getting 1 to hundred 100 numbers divided by 3
        CanDivideByFive(); //method of getting 1 to hundred 100 numbers divided by 5

    }

    public static void CanDivideByFive() {
            System.out.println("Numbers Between 1 to 100 divided by 5 are : ");
            //for loop
            for (a = 1; a < 100; a++)
            {if (a % 5 == 0)

                System.out.println(a+ ",");}

    }

    public static void CanDivideByThree()
    {
        System.out.println("Numbers Between 1 to 100 divided by 3 are : ");
        //for loop
        for (i = 1; i < 100; i++)
        {if (i % 3 == 0)

            System.out.println(i+ ",");}



    }
}

