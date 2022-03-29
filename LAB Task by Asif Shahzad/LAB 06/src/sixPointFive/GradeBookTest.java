package sixPointFive;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        GradeBook gb = new GradeBook(input.nextLine());

        System.out.print("Enter Number of Students: ");
        Student[] students = new Student[input.nextInt()];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter " + (i + 1) + " Student ID: ");
            students[i].setId(input.nextInt());

            System.out.print("Enter " + (i + 1) + " Student Name: ");
            input.nextLine();
            students[i].setName(input.nextLine());

            System.out.print("Enter " + (i + 1) + " Student Number of Tests: ");
            int noOfTests = input.nextInt();
            int[] marks = new int[noOfTests];

            for (int j = 0; j < marks.length; j++) {
                System.out.print("Enter " + (i + 1) + " Student's " + (j + 1) + " Test Marks: ");
                marks[j] = input.nextInt();
            }
            students[i].setMarks(marks);

            gb.setStudents(students);
        }
    }
}
