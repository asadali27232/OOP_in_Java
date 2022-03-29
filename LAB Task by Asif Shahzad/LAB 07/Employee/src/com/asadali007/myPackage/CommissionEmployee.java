package com.asadali007.myPackage;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        super();
        setGrossSales(0.0);
        setCommissionRate(0.0);
    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0)
            this.grossSales = grossSales;
        else throw new IllegalArgumentException("Gross Sales should be greatter then '0'");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0 && commissionRate <= 1)
            this.commissionRate = commissionRate;
        else throw new IllegalArgumentException("Gross Sales should be '0.0 - 1.0'");
    }

    @Override
    public String toString() {
        return super.toString() + "Type: CommissionEmployee\n" + "Gross Sales: " + getGrossSales() + "\n" +
                "Commission Rate: " + getCommissionRate() + "\n";
    }

    @Override
    public double getSalary(){
        double salary;
        salary = getGrossSales() * getCommissionRate();
        return salary;
    }
}
