package TestPacakge;

import com.asadali007.myPackage.BasePlusCommissionEmployee;
import com.asadali007.myPackage.CommissionEmployee;
import com.asadali007.myPackage.HourlyEmployee;


public class EmployeeTest {
    public static void main(String[] args) {

        // Testting CommissionEmployee which inherits Employee
        try {
            CommissionEmployee comissionEmployee1 = new CommissionEmployee("Asad", "Ali", "35202-5115417-7", 300000, 0.5);
            System.out.println(comissionEmployee1);
            double salary = comissionEmployee1.getSalary();
            System.out.println("Salary is: " + salary);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occured while creating CommissionEmployee Type Employee: " + e.getMessage());
        }

        // Testing BasePlusCommissionEmployee whisch inherits CommissionEmployee which further inherits Employee
        try {
            BasePlusCommissionEmployee baseEmployee1 = new BasePlusCommissionEmployee("Asad", "Ali", "35202-5115417-7", 300000, 0.3, 5000);
            System.out.println(baseEmployee1);
            double salary = baseEmployee1.getSalary();
            System.out.println("Salary is: " + salary);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occured while creating BasePlusCommissionEmployee Type Employee: " + e.getMessage());
        }
        // Testting HourlyEmployee which inherits Employee
        try {
            HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Asad", "Ali", "35202-5115417-7", 50, 100);
            System.out.println(hourlyEmployee1);
            double salary = hourlyEmployee1.getSalary();
            System.out.println("Salary is: " + salary);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occured while creating HourlyEmployee Type Employee: " + e.getMessage());
        }
    }
}
