/*Write a java program to input student Name, roll No, and three subjects Maths, Science and English
marks(marks is between 0 to 100 and if it is out of range print error message "Invalid Input, Marks should
between 0 to 100") and find out total, percentage and result.
*If he is pass or fail on basis of percentage(pass>=35) and also give them grade
>=80 A+, >=60 A, >=50 B, >=35 C And print Mark Sheet in following format */
package homeworkweek7;

import java.text.DecimalFormat;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade
>= 80 A+, >= 60 A, >= 50 B, >= 35 C And print Mark Sheet in following format*/
public class MarkSheet {
    static String studentName;
    static int rollNo;
    static int mathMarks;
    static int scienceMarks;
    static int englishMarks;
    static int total;
    static DecimalFormat df = new DecimalFormat("0.00");
    static float percentage;
    static String result;
    static String grade;


    public MarkSheet(String studentName, int rollNo, int mathMarks, int scienceMarks, int englishMarks) {
        MarkSheet.studentName = studentName;
        MarkSheet.rollNo = rollNo;
        MarkSheet.mathMarks = mathMarks;
        MarkSheet.scienceMarks = scienceMarks;
        MarkSheet.englishMarks = englishMarks;


    }

    public static void main(String[] args) {

        MarkSheet m1 = new MarkSheet("Jitu Bond VVN ", 101, 99, 90, 80);

        if (mathMarks >= 0 && mathMarks <= 100) {
            mathMarks = mathMarks;
        } else {
            System.out.println("ERROR: Invalid Input, Maths Marks should be between 0 to 100");


        }
        if (scienceMarks >= 0 && scienceMarks <= 100) {
            scienceMarks = scienceMarks;
        } else {
            System.out.println("Error: Invalid Input, Science Marks should be between 0 to 100");
        }
        if (englishMarks >= 0 && englishMarks <= 100) {
            englishMarks = englishMarks;
        } else {
            System.out.println("Error: Invalid Input, English Marks should be between 0 to 100");
        }
        TotalMarks();
        Percentage();
        Result();
        Grade();

    }

    public static void TotalMarks() {
        int total = mathMarks + scienceMarks + englishMarks;
        System.out.println(" __________________________________________________");
        System.out.println("|                                                  |");
        System.out.println("|                   Mark Sheet                     |");
        System.out.println("|                                                  |");
        System.out.println(" --------------------------------------------------");
        System.out.println("|  Name    :    " + studentName + "                      |");
        System.out.println("|  Roll No :    "  + rollNo + "                                |");
        System.out.println("|                                                  |");
        System.out.println(" --------------------------------------------------");
        System.out.println("|  Subjects:                      Marks            |");
        System.out.println(" --------------------------------------------------");
        System.out.println("|  Math                         :  " + mathMarks +"              |");
        System.out.println("|  Science                      :  " + scienceMarks+"              |");
        System.out.println("|  English                      :  " + englishMarks +"              |");
        System.out.println("|                                                  |");
        System.out.println(" --------------------------------------------------");
        System.out.println("|  Total                        :  " + total + "             |");
        System.out.println(" --------------------------------------------------");
    }

    public static void Percentage() {
        float percentage = (mathMarks + scienceMarks + englishMarks) / 3f;
        System.out.println("|  Percentage                   :  " +df.format(percentage) + "           |");

    }

    public static void Result() {
        float percentage = (mathMarks + scienceMarks + englishMarks) / 3f;

        if (percentage >= 35) {
            System.out.println("|  Result                       :  Pass            |");

        } else {
            System.out.println("|  Result                       :  Fail            |");
        }

    }

    public static void Grade() {
        float percentage = (mathMarks + scienceMarks + englishMarks) / 3f;
        if (percentage >= 80) {
            System.out.println("|  Grade                        :  A+              |");
            System.out.println("|                                                  |");
            System.out.println(" --------------------------------------------------");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("|  Grade                        :  A               |");
            System.out.println("|                                                  |");
            System.out.println(" --------------------------------------------------");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("|  Grade                        :  B    |");
            System.out.println("|                                                  |");
            System.out.println(" --------------------------------------------------");
        } else if (percentage >= 35 && percentage < 50) {
            System.out.println("|  Grade                        :   C              |");
            System.out.println("|                                                  |");
            System.out.println(" --------------------------------------------------");
        }

    }
}
