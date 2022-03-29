package com.asadali007.myPackage;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee() {
        setFirstName("");
        setLastName("");
        setSocialSecurityNumber("");
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    protected void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "\nEmployee Details:\n" +
                "Employee Name: " + getFirstName() + " " + getLastName() + "\n" +
                "Social Security Number: " + getSocialSecurityNumber() + "\n";
    }

    protected double getSalary() {
        return 0.0;
    }
}
