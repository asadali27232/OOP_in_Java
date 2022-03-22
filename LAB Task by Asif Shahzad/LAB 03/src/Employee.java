public class Employee {
    private String name;
    private long cnic;
    private double salary;

    public Employee() {
        System.out.println("No Argument Constructor Called");
    }

    public Employee(String name, long cnic) {
        setName(name);
        setCnic(cnic);
    }

    public Employee(String name, long cnic, double salary) {
        this(name, cnic);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCnic() {
        return cnic;
    }

    public void setCnic(long cnic) {
        this.cnic = cnic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
