import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        // Setting pass limit
        System.out.print("Input the passing marks limit: ");
        int pass_limit = input.nextInt();
        Student.setPassLimit(pass_limit);
    
        // Testing by getting marks from user
        String name = "Asad Ali";
    
        String[] studentCourses = new String[3];
        studentCourses[0] = "OOP";
        studentCourses[1] = "PF";
        studentCourses[2] = "DSA";
    
        Student student = new Student(name, studentCourses);
    
        double[] studentMarks = new double[3];
        System.out.print("Enter obtained marks in " + studentCourses[0] + ": ");
        studentMarks[0] = input.nextDouble();
        System.out.print("Enter obtained marks in " + studentCourses[1] + ": ");
        studentMarks[1] = input.nextDouble();
        System.out.print("Enter obtained marks in " + studentCourses[2] + ": ");
        studentMarks[2] = input.nextDouble();
    
        student.setMarks(studentMarks);
    
        student.displayCourseInfo();
        System.out.println(student);
    
        // Retrieving students data in Test class
        studentCourses = student.getCourses();
        studentMarks = student.getMarks();
    
        // Checking whether the student passed in each course or not
        for (int i = 0; i < student.getCourses().length; i++) {
            if (studentMarks[i] > Student.getPassLimit())
                System.out.println("Student PASSED in " + studentCourses[i]);
            else
                System.out.println("Student FAILED in " + studentCourses[i]);
        }
        // Testing Student class with Student,s array
        Student[] studentArray = new Student[3];
        
        
    
        // Setting some random marks to all the courses of all students (using studentMarks and studentCourses array
        // declared above)
        for (int i = 0; i < studentMarks.length; i++)
            studentMarks[i] = 30;
        studentArray[0] = new Student("Haroon", studentCourses, studentMarks);
    
        for (int i = 0; i < studentMarks.length; i++)
            studentMarks[i] = 40;
        studentArray[1] = new Student("Hassan", studentCourses, studentMarks);
    
        for (int i = 0; i < studentMarks.length; i++)
            studentMarks[i] = 60;
        studentArray[2] = new Student("Babar", studentCourses, studentMarks);
    
        // Getting Average of each course
        double[] courseAverage;
        courseAverage = Student.courseAverage(studentArray);
        
        // Displaying courseAverage
        studentCourses = studentArray[0].getCourses();
    
        System.out.println("Course Average");
        for (int i = 0; i < studentArray.length; i++)
            System.out.printf("%-10s", studentCourses[i] );
        System.out.println();
        for (int i = 0; i < courseAverage.length; i++)
            System.out.printf("%-10.2f", courseAverage[i]);
    
        // Getting Average of each student
        double[] studentAverage = new double[3];
        
        for (int i = 0; i < studentArray.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < studentArray[i].getMarks().length; j++) {
                double[] marks = studentArray[i].getMarks();
                sum = sum + marks[j];
            }
            studentAverage[i] = sum/3;
        }
        
        // Displaying studentAverage
        String[] names = new String[3];
        for (int i = 0; i < studentArray.length; i++)
            names[i] = studentArray[i].getStd_name();
    
        System.out.println();
        System.out.println("Student Average");
        for (int i = 0; i < studentArray.length; i++)
            System.out.printf("%-10s", names[i] );
        System.out.println();
        for (int i = 0; i < studentAverage.length; i++)
            System.out.printf("%-10.2f", studentAverage[i]);
        System.out.println();
    
    }
}