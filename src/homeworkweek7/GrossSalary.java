//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF
package homeworkweek7;

public class GrossSalary {


    static int employeeId;
    static String name;
    static int basicSalary;
    static int hra;
    static int ta;
    static int da;
    static int pf;
    static int salary;

    public GrossSalary(int employeeId, String name, int basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;


    }

    public static void main(String[] args) {
        GrossSalary g1 = new GrossSalary(2564, "Andy Murray", 111000);
        System.out.println(" __________________________________________________");
        System.out.println("|                  Salary Slip                     |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Employee Id                    :" + employeeId +         "             |");
        System.out.println("| Employee Name                  :" + name +       "      |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Basic Salary                   :" + basicSalary +            "           |");

        Hra10Percent();
        Ta8Percent();
        Da9Percent();
        Pf20Percent();
        FinalSalary();
    }

    public static void Hra10Percent() {
        int hra = basicSalary / 10;
        System.out.println("| HRA 10%                        :" + hra +          "            |");

    }

    public static void Ta8Percent() {
        int ta = (basicSalary * 8) / 100;
        System.out.println("| TA 8%                          :" + ta +                   "             |");

    }

    public static void Da9Percent() {
        int da = (basicSalary * 9) / 100;
        System.out.println("| DA 9%                          :" + da +                       "             |");

    }

    public static void Pf20Percent() {
        int pf = (basicSalary * 20) / 100;
        System.out.println("| PF -20&                        :" + pf +                     "            |");
    }

    public static void FinalSalary() {
        int hra = basicSalary / 10;
        int ta = (basicSalary * 8) / 100;
        int da = (basicSalary * 9) / 100;
        int pf = (basicSalary * 20) / 100;
        int salary = basicSalary + hra + ta + da -pf;
        System.out.println("|__________________________________________________|");
        System.out.println("| Gross Salary                   :" + salary +                     "           |");
        System.out.println("|==================================================|");
    }

    private static class object {
    }
}


