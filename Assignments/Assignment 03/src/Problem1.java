import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// This Program can
//  - Read from Binary & Write to Binary
//  - Read from Text & Write to Text
//  - Read from Binary & Write to Text
//  - Read from Text & Write to Binary

// For Input
//      - If User Enter an Input_File_Name with .txt Extension then Program will Read Text File
//      - If User Enter an Input_File_Name with .dat Extension then Program will Read Binary File
// For Output
//      - If User Enter an Output_File_Name with .txt Extension then a .txt file is Created
//      - If User Enter an output _File_Name with .dat Extension then a .dat file is Created

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strArr; // to store name and extension of file seperated by split method
        ArrayList<Integer> reversedArray = new ArrayList<Integer>();
        do {
            System.out.print("Enter Input File Name with Extension: ");
            String inFilename = input.nextLine();

            strArr = inFilename.split("[.]", 0);
            if (strArr.length == 2) {
                if (strArr[1].equals("dat")) {
                    reversedArray = reversOrder(readBinaryFile(inFilename));
                } else if (strArr[1].equals("txt")) {
                    reversedArray = reversOrder(readTextFile(inFilename));
                }
            } else
                System.out.println("File Name is NOT Valid...!");
        } while (!(strArr.length == 2));

        do {
            System.out.print("Enter Output File Name with Extension: ");
            String outFilename = input.nextLine();

            strArr = outFilename.split("[.]", 0);
            if (strArr.length == 2) {
                if (strArr[1].equals("dat")) {
                    writeBinaryFile(reversedArray, outFilename);
                } else if (strArr[1].equals("txt")) {
                    writeTextFile(reversedArray, outFilename);
                }
            } else
                System.out.println("File Name is NOT Valid...!");
        } while (!(strArr.length == 2));
    }

    // ---Read from Binary File---
    private static ArrayList<Integer> readBinaryFile(String inFilename) {
        ObjectInputStream fileInput = null;
        ArrayList<Integer> integersOfFile = new ArrayList<Integer>();
        try {
            fileInput = new ObjectInputStream(new FileInputStream(inFilename));
        } catch (IOException e) {
            System.out.println("File not Found...!");
            e.printStackTrace();
        }

        try {
            integersOfFile.add((Integer) fileInput.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (true) {
                int nextInput = (Integer) fileInput.readInt();
                if (nextInput != integersOfFile.get(integersOfFile.size() - 1))
                    integersOfFile.add(nextInput);
            }
        } catch (IOException e) {

        }
        try {
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Binary File Read Successfully!");
        return integersOfFile;
    }

    // ---Write to the Binary File---
    private static void writeBinaryFile(ArrayList<Integer> integersOfFile, String outFilename) {
        ObjectOutputStream fileOutput = null;
        try {
            fileOutput = new ObjectOutputStream(new FileOutputStream(outFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < integersOfFile.size(); i++) {
            try {
                fileOutput.writeInt(integersOfFile.get(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Binary File Written Successfully!");
    }

    // ---Read from the Text File---
    private static ArrayList<Integer> readTextFile(String inFilename) {
        Scanner fileInput = null;
        ArrayList<Integer> integersOfFile = new ArrayList<>();
        try {
            fileInput = new Scanner(new File(inFilename));
        } catch (FileNotFoundException e) {
            System.out.println("File not Found...!");
            e.printStackTrace();
        }
        integersOfFile.add(fileInput.nextInt());
        while (fileInput.hasNextInt()) {
            int nextInput = fileInput.nextInt();
            if (nextInput != integersOfFile.get(integersOfFile.size() - 1))
                integersOfFile.add(nextInput);
        }
        System.out.println("Text File Read Successfully!");
        return integersOfFile;
    }

    // ---Write to the Text File---
    private static void writeTextFile(ArrayList<Integer> integersOfFile, String outFilename) {
        PrintWriter fileOutput = null;
        try {
            fileOutput = new PrintWriter(outFilename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < integersOfFile.size(); i++) {
            fileOutput.println(integersOfFile.get(i));
        }
        System.out.println("Text File Written Successfully!");
        fileOutput.close();
    }

    // ---Reverse the ArrayList---
    public static ArrayList<Integer> reversOrder(ArrayList<Integer> integersOfFile) {
        ArrayList<Integer> reverseIntegers = new ArrayList<>();

        for (int i = integersOfFile.size() - 1; i >= 0; i--) {
            reverseIntegers.add(integersOfFile.get(i));
        }
        System.out.println("Reversed Successfully!");
        return reverseIntegers;
    }
}
