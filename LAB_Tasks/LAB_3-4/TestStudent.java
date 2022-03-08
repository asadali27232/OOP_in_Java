import java.util.Scanner;

public class TestStudent{



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pl = sc.nextInt();
        Student.setPassLimit(pl);

        String[] courses = new String[2];
        courses[0] = "DLD";
        courses[1] = "ICT";


        double[] marks = {0.0, 0.0};


        Student s = new Student("Nasir", courses, marks);
        for(int i=0;i<marks.length; i++)
        {
            marks[i] = sc.nextDouble();
        }
        s.setMarks(marks);
        // modified the marks local variable
        marks = s.getMarks();
        courses = s.getCourses();
        System.out.println(marks.length + ", " + courses.length);
        for(int i=0;i<s.getCourses().length; i++)
        {
            if(marks[i]>Student.getPassLimit())
                System.out.println("Student passed in " + courses[i]);
            else
                System.out.println("Student failed in " + courses[i]);
        }
        String str = s.toString();
        System.out.println(s + "Welcome");


        Student[] std = new Student[3];
        String[] core = new String[3];
        core[0] = "ICT";
        core[1] = "PF";
        core[2] = "OOP";

        double[] initMarks = new double[3];
        for (int i=0; i< initMarks.length;i++){
            initMarks[i] = i+10*3;
        }
        std[0] = new Student("Asad", core, initMarks );

        for (int i=0; i< initMarks.length;i++){
            initMarks[i] = i+10*2;
        }
        std[1] = new Student("Ali", core, initMarks );

        for (int i=0; i< initMarks.length;i++){
            initMarks[i] = i+10*1;
        }
        std[2] = new Student("Ghaffar", core, initMarks );

        // Average Marks
        double ictAverage;
        double pfAverage;
        double oopAverage;

        ictAverage = std[0].marks[0] + std[1].marks[0] +std[2].marks[0];
        pfAverage = std[0].marks[1] + std[1].marks[1] +std[2].marks[1];
        oopAverage = std[0].marks[2] + std[1].marks[2] +std[2].marks[2];

        System.out.println("ICT Average: " + ictAverage + " PF Average: " + pfAverage + " OOP Average: " + oopAverage);

        double[] avg = new double[3];
        for (int i=0; i <  std.length; i++) {
            double sum = 0;
            for (int j = 0; j < std.length; j++){
                sum = sum + std[j].marks[i];
                avg[j] = sum/std.length;
            }
        }


        double[] sum = StudentAverage(std);
    }

    public static double[] StudentAverage(Student[] std) {
        double[] sum =new double[3];
        for (int i=0; i <  std.length; i++) {
            for (int j = 0; j < std[i].getMarks().length; j++){
                double[] marks = std[i].getMarks();
                sum[j] = sum[j] + marks[j];
            }
        }
        return sum;
    }
}