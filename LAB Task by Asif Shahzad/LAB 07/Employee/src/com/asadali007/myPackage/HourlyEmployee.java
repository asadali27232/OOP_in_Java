package com.asadali007.myPackage;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double hourlyWage) {
        super(firstName, lastName, socialSecurityNumber);
        setHoursWorked(hoursWorked);
        setHourlyWage(hourlyWage);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0 && hoursWorked <= 168)
            this.hoursWorked = hoursWorked;
        else throw new IllegalArgumentException("Hourly Wage should be between '0 - 168'");

    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage >= 0)
            this.hourlyWage = hourlyWage;
        else throw new IllegalArgumentException("Hourly Wage should be non-negative.");
    }

    @Override
    public String toString() {
        return super.toString()+ "Type: HourlyEmployee\n" + "Hourly Wage: " + getHourlyWage() + "\n" +
                "Total Hours Worked: " + getHoursWorked() + "\n";
    }

    @Override
    public double getSalary() {
        double salary = getHourlyWage() * getHoursWorked();
        return salary;
    }
}
