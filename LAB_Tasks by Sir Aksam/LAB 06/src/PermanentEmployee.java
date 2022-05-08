public class PermanentEmployee extends Employee {
    private double hourlyIncome;

    public PermanentEmployee() {
        this("", -1, 0.0);
    }

    public PermanentEmployee(String name, int empID, double hourlyIncome) {
        super(name, empID);
        setHourlyIncome(hourlyIncome);
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }

    public void setHourlyIncome(double hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public double calculate_income() {
        double income = getHourlyIncome() * 180;
        return income;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                                + "This Month Salary: "
                                + "@" + getHourlyIncome() + " PKR/Hour = " + calculate_income();
    }
}
