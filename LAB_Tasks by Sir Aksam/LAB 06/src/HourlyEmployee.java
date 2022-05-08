import java.util.Scanner;

public class HourlyEmployee extends Employee {
    private double hourlyIncome;
    private int totalHours;

    public HourlyEmployee() {
        this("", -1, 0.0);
    }

    public HourlyEmployee(String name, int empID, double hourlyIncome) {
        super(name, empID);
        setHourlyIncome(hourlyIncome);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total Work Hours: ");
        setTotalHours(input.nextInt());
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }

    public void setHourlyIncome(double hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public double calculate_hourly_income() {
        double income = getHourlyIncome() * getTotalHours();
        return income;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "This Month Salary: "
                + getTotalHours() + " x " + getHourlyIncome() + " = " + calculate_hourly_income();
    }
}
