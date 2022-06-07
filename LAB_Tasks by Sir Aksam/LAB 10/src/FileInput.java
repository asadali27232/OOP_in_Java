import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        BatchClass b2 = new BatchClass();
        try {
            FileReader inputFile = new FileReader("input.txt");
            Scanner input = new Scanner(inputFile);

            b2.setBatchName(input.next());
            b2.setStartYear(input.nextInt());
            b2.setEndYear(input.nextInt());
            input.nextLine();

            String[] subjects = new String[4];
            int[][] marks = new int[4][3];

            int i = 0;
            while (input.hasNextLine()) {
                subjects[i] = input.next();

                for (int j = 0; j < 3; j++) {
                    marks[i][j] = input.nextInt();
                }
                input.nextLine();
                i++;
            }
            b2.setSubjects(subjects);
            b2.setMarks(marks);
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter output = new PrintWriter("output.txt");
            System.out.println(b2);
            output.println(b2.toString());
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
