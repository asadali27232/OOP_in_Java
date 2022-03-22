package Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of Student.Student: ");
        String name = input.nextLine();
        System.out.print("Enter CNIC of Student.Student: ");
        long cnic = input.nextLong();
        System.out.print("Enter Street Student.Address of Student.Student: ");
        input.nextLine();
        String streetAddress = input.nextLine();
        System.out.print("Enter Town of the Student.Student: ");
        String town = input.nextLine();
        System.out.print("Enter City of the Student.Student; ");
        String city = input.nextLine();
        System.out.print("Enter Country of teh Student.Student: ");
        String country = input.nextLine();
        System.out.print("Enter Phone Number of Student.Student(Format: 00 000 00000):");
        int countryCode = input.nextInt();
        int cityCode = input.nextInt();
        int lineNumber = input.nextInt();
        PhoneNumber phoneNumber = new PhoneNumber(countryCode, cityCode, lineNumber);
        Address address = new Address(streetAddress, town, city, country,phoneNumber);
        Student student1 = new Student(name, cnic, address);
        System.out.print("Enter First Student.Course Code and Student.Course Name (Format: 101 Object Oriented Programming): ");
        int courseCode = input.nextInt();
        String courseName = input.nextLine();
        student1.setCourse1(new Course(courseCode, courseName));
        System.out.print("Enter First Student.Course Code and Student.Course Name (Format: 101 Object Oriented Programming): ");
        courseCode = input.nextInt();
        courseName = input.nextLine();
        student1.setCourse2(new Course(courseCode, courseName));
        System.out.println(student1);
    }
}
