public class Student {
    
        private String std_name;
        private String[] courses;
        private double[] marks;
        private static int passLimit;
        
    public Student(String std_name, String[] courses, double[] marks) {
        this.std_name = std_name;
        this.courses = courses;
        this.marks = marks;
    }
    public Student(String std_name, String[] courses) {
        this.std_name = std_name;
        this.courses = courses;
    }
    public Student(double[] marks) {
        this.marks = marks;
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
    
    public void displayCourseInfo(){
        System.out.print("Student '" + std_name + "' has registered the following courses: ");
        for (int i=0 ; i<courses.length ; i++){
            System.out.print("'" + courses[i] + "' ");
        }
        double displaySum = 0.0;
        for (int i=0 ; i< marks.length ; i++){
            displaySum += marks[i];
        }
        System.out.println("and the sum of obtained marks in these subjects is: " + displaySum + ".");
    }
    
    public String toString() {
        String toStr = std_name + "( ";
        for (int i=0 ; i<courses.length ; i++){
            toStr += "'" + courses[i] + "' ";
        }
        toStr += ")";
        return toStr;
    }
    
    public static double[] courseAverage(Student[] studentArray){
        double[] courseAverage = new double[3];
        for (int i = 0; i < studentArray[0].getCourses().length; i++) {
            double sum = 0;
            for (int j=0 ; j < studentArray.length; j++)
                sum += studentArray[j].marks[i];
            
            courseAverage[i] = sum/studentArray.length;
        }
        return courseAverage;
    }
}
