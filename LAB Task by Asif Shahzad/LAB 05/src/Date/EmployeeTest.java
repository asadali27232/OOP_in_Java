package Date;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
        System.out.print("Enter Employee Hire Date (Format: DD MM YYYY): ");
        Date hireDate = new Date(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.print("Enter Employee Birth Date (Format: DD MM YYYY): ");
        Date birthDate = new Date(input.nextInt(), input.nextInt(), input.nextInt());
        Employee employee = new Employee(id, name, hireDate, birthDate);
        System.out.println(employee);
    }
}
