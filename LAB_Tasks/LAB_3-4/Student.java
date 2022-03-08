public class Student {
    private String std_name;
    private String [] courses;
    public double[] marks;
    private static int passLimit;



    public Student(String std_name, String[] courses, double[] marks) {
        this.std_name = std_name;
        this.courses = courses;
        this.marks = marks;
    }



    public Student() {
        this.std_name = "Ali";
        this.courses = new String[2];
        courses[0] = "OOP";
        courses[1] = "PF";
        this.marks = new double[2];
        marks[0] = 50.0;
        marks[1] = 60.0;
    }

    public void displayStudentInfo()
    {
        System.out.println("Student \"Ali\": " );
        for(String s : courses)
        {
            System.out.println(s);
        }
        int sum=0;
        for(double d: marks)
            sum+=d;
        System.out.println(sum);
    }
    public String toString()
    {
        String s="";
        s = s + std_name;
        for(String s1 : courses)
        {
            s+=s1;
        }
        return s;
    }

    public String getStd_name() {
        return std_name;
    }



    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }



    public String[] getCourses() {
        return courses;
    }



    public void setCourses(String[] courses) {
        this.courses = courses;
    }



    public double[] getMarks() {
        return marks;
    }



    public void setMarks(double[] marks) {
        this.marks = marks;
    }



    public static int getPassLimit() {
        return passLimit;
    }



    public static void setPassLimit(int passLimit) {
        Student.passLimit = passLimit;
    }





}