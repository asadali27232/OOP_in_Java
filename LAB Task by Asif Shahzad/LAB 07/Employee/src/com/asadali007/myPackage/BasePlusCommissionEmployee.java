package com.asadali007.myPackage;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        setBaseSalary(0.0);
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "Type: BasePlusCommissionEmployee\n" + "Base Salary: " + getBaseSalary() + "\n";
    }

    @Override
    public double getSalary(){
        double salary = super.getSalary() + getBaseSalary();
        return salary;
    }
}
