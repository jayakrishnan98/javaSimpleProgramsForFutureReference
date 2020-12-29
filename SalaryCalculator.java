import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        double salary;
        double sales;
        double incentive;
        double bonus;
        double hra;
        double basic = 4000;
        double conveyance = 500;
        double da = 1.1 * basic;
        
        System.out.print("Enter the sales;");
        sales = sc.nextFloat();

        if (sales >= 100000) {
            hra = 0.2 * basic;
            incentive = 0.1 * sales;
            bonus = 1000;
        } 
        else {
            hra = 0.1 * basic;
            incentive = 0.04 * sales;
            bonus = 5000;
        }
        salary = basic + hra + da + conveyance + incentive + bonus;
        System.out.println("Salary of Sales executive =" + salary);
    }
}

