package Date;

public class Employee {
    private int id;
    private String name;
    private Date hireDate;
    private Date birthDate;

    public Employee(int id, String name, Date hireDate, Date birthDate) {
        setId(id);
        setName(name);
        setHireDate(hireDate);
        setBirthDate(birthDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", birthDate=" + birthDate +
                '}';
    }
}
