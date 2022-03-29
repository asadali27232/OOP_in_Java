package sixPointFive;

public class Student {
    private int id;
    private String name;
    private int[] marks;

    public Student() {
        this(0, "");
    }

    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    public Student(int id, String name, int... marks) {
        setId(id);
        setName(name);
        setMarks(marks);
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

    public int[] getMarks() {
        return marks;
    }

    public int getMarks(int index) {
        return marks[index];
    }

    public void setMarks(int[] marks) {
        if (marks.length <= 10) {
            this.marks = new int[marks.length];
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] <= 100)
                    this.marks[i] = marks[i];
                else System.out.println("Max marks in each test should be 100 or less!");
            }
        } else System.out.println("Max number of test should be 10 or less!");
    }

    public void setMarks(int index, int marks) {
        this.marks[index] = marks;
    }

    public double marksSum() {
        double sum = 0;
        for (int i = 0; i < this.getMarks().length; i++) {
            sum += this.getMarks(i);
        }
        return sum;
    }

    public double marksAverage() {
        double sum = this.marksSum();
        return sum / getMarks().length;
    }

    public void minMarks() {
        int minMarks = 9999;
        for (int i = 0; i < this.getMarks().length; i++) {
            if (this.getMarks(i) < minMarks) {
                minMarks = this.getMarks(i);
            }
        }
        System.out.println("Student ID: " + this.getId());
        System.out.println("Minimum Marks: " + minMarks);
    }

    public void maxMarks() {
        int maxMarks = -1;
        for (int i = 0; i < this.getMarks().length; i++) {
            if (this.getMarks(i) > maxMarks) {
                maxMarks = this.getMarks(i);
            }
        }
        System.out.println("Student ID: " + this.getId());
        System.out.println("Maximum Marks: " + maxMarks);
    }

    public static void minMaxAvg(Student student) {
        double sum = 0;
        for (int i = 0; i < student.getMarks().length; i++) {
            sum += student.getMarks(i);
        }
        System.out.println("Student ID: " + student.getId());
        System.out.println("Average: " + sum / student.getMarks().length);

        int minMarks = 9999;
        for (int i = 0; i < student.getMarks().length; i++) {
            if (student.getMarks(i) < minMarks) {
                minMarks = student.getMarks(i);
            }
        }
        System.out.println("Minimum Marks: " + minMarks);

        int maxMarks = -1;
        for (int i = 0; i < student.getMarks().length; i++) {
            if (student.getMarks(i) > maxMarks) {
                maxMarks = student.getMarks(i);
            }
        }
        System.out.println("Student ID: " + student.getId());
        System.out.println("Maximum Marks: " + maxMarks);
    }
}