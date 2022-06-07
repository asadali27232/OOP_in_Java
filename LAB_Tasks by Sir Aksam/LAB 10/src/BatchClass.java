import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BatchClass implements java.io.Serializable {
    private String batchName;
    private int startYear, endYear;
    private final int numSubjects;
    private String[] subjects;
    private int[][] marks;

    public BatchClass(String batchName, int startYear, int endYear, int numSubjects, String[] subjects, int[][] marks) {
        this.batchName = batchName;
        this.startYear = startYear;
        this.endYear = endYear;
        this.numSubjects = numSubjects;
        this.subjects = subjects;
        this.marks = marks;
    }

    public BatchClass() {
        this.numSubjects = 4;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getNumSubjects() {
        return numSubjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int[][] getMarks() {
        return marks;
    }

    public void setMarks(int[][] marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        final int nS = 4;
        String[] subs = {"OOP", "DLD", "LA", "PHY"};
        int[][] marks = {{85, 92, 67, 90}, {76, 89, 22, 55}, {94, 45, 78, 67}, {22, 58, 72, 88}};
        BatchClass b1 = new BatchClass("SP18-BCS-C", 2018,
                2022, nS, subs, marks);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("batch.dat"));
            oos.writeObject(b1);
            if (oos != null)
                oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("batch.dat"));
            BatchClass obj;
            b1 = (BatchClass) ois.readObject();
            System.out.println(b1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "BatchClass { " +
                "batchName = '" + batchName + '\'' +
                ", startYear = " + startYear +
                ", endYear = " + endYear +
                ", numSubjects = " + numSubjects +
                ", subjects = " + Arrays.toString(subjects) +
                "\nMarks = " +
                Arrays.toString(marks[0]) + ", " +
                Arrays.toString(marks[1]) + ", " +
                Arrays.toString(marks[2]) + ", " +
                Arrays.toString(marks[3]) +
                " }";
    }
}
