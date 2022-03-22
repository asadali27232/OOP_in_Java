package Student;

public class Student {
    private String name;
    private long cnic;
    private Course course1;
    private Course course2;
    private Address address;

    public Student(String name, long cnic, Address address) {
        this.name = name;
        this.cnic = cnic;
        this.address = address;
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

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student.Student{" +
                "name='" + name + '\'' +
                ", cnic=" + cnic +
                ", course1=" + course1 +
                ", course2=" + course2 +
                ", address=" + address +
                '}';
    }
}
