import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // Setting pass limit
        System.out.print("Input the passing marks limit: ");
        int pass_limit = input.nextInt();
        Student.setPassLimit(pass_limit);
        
        // Testing without user input
        String asadAli = "Asad Ali";
        
        String[] asadCourses = new String[3];
        asadCourses[0] = "OOP";
        asadCourses[1] = "PF";
        asadCourses[2] = "DSA";
    
        double[] asadMarks = new double[3];
        asadMarks[0] = 85;
        asadMarks[1] = 90;
        asadMarks[2] = 10;
        
        Student asad = new Student(asadAli, asadCourses, asadMarks);
        asad.displayCourseInfo();
        System.out.println(asad);
        
        
        
        
        
        
        
        
        
        
    }
}
