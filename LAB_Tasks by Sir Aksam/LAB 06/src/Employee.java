public class Employee {
    private String name;
    private int empID;

    public Employee() {
        this("", -1);
    }

    public Employee(String name) {
        this(name, -1);
    }

    public Employee(int empID) {
        this("", empID);
    }

    public Employee(String name, int empID) {
        setName(name);
        setEmpID(empID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + " (ID: " + getEmpID() + ")";
    }

    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Asghar Ali", 1001, 1000);
        PermanentEmployee permanentEmployee = new PermanentEmployee("Amjad Ali", 2001, 1000);

        System.out.println();
        System.out.println("Calculated Salary of Hourly Employee: " + hourlyEmployee.calculate_hourly_income());
        System.out.println(hourlyEmployee);
        System.out.println();
        System.out.println("Calculated Salary of Permanent Employee: " + permanentEmployee.calculate_income());
        System.out.println(permanentEmployee);
    }
}
