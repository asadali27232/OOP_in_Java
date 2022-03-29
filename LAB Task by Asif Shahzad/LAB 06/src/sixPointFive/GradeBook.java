package sixPointFive;

public class GradeBook {
    private String courseName;
    private Student[] students;

    public GradeBook() {
        setCourseName("");
    }

    public GradeBook(String courseName) {
        setCourseName(courseName);
    }

    public GradeBook(String courseName, Student[] students) {
        setCourseName(courseName);
        setStudents(students);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getStudents(int studentIndex) {
        return this.students[studentIndex];
    }

    public void setStudents(Student... students) {
        if (students.length  <= 50) {
            this.students = new Student[students.length];
            for (int i = 0; i < students.length; i++) {
                this.students[i] = students[i];
            }
        } else System.out.println("Max number of Students should be 50 or less!");
    }

    public void setStudents(int studentIndex, Student student) {
        this.students[studentIndex] = student;
    }

    public int maxNumberTest() {
        int maxTest = 0;
        int id = 0;
        for (int i = 0; i < this.getStudents().length; i++) {
            if (students[i].getMarks().length > maxTest) {
                maxTest = students[i].getMarks().length;
                id = students[i].getId();
            }
        }
        return id;
    }

    public int maxAverage() {
        double average = -1;
        int id = 0;
        for (int i = 0; i < this.getStudents().length; i++) {
            if (this.students[i].marksAverage() > average) {
                average = this.students[i].marksAverage();
                id = this.students[i].getId();
            }
        }
        return id;

    }

    public double classAverage() {
        double classSum = 0;
        int numberOfTests = 0;
        for (int i = 0; i < this.getStudents().length; i++) {
            classSum += this.students[i].marksSum();
            numberOfTests += this.students[i].getMarks().length;
        }
        return classSum / numberOfTests;
    }

    public double[] eachAverage() {
        double[] eachAverage = new double[getStudents().length];

        for (int i = 0; i < this.getStudents().length; i++) {
            eachAverage[i] = students[i].marksAverage();
        }
        return eachAverage;
    }
}
