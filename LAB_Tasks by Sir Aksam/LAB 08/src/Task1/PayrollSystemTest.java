package Task1;

import java.time.LocalDate;

public class PayrollSystemTest {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // get current system date/time

        Date dob1 = new Date(5, 2, 2001);
        Date dob2 = new Date(5, 4, 2001);
        Date dob3 = new Date(5, 6, 2001);
        Date dob4 = new Date(5, 8, 2001);

        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, dob1);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, dob2);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, dob3);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300, dob4);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            // determine whether element is a Task1.BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Task1.Employee reference to
                // Task1.BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            if (currentEmployee.getDateOfBirth().getMonth() == myObj.getMonthValue()) {
                System.out.println("Happy Birthday Bonus 100$");
                System.out.printf("earned $%,.2f%n%n", (currentEmployee.earnings() + 100));
            } else
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Task1.Employee %d is a %s%n", j, employees[j].getClass().getName());

    }
}
