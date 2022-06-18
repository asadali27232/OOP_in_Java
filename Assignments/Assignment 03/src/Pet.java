import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pet implements Serializable, Comparable<Pet> {
    private String name;
    private int age; //in years
    private double weight;//in pounds

    public Pet() {
        this("No Name Yet", 0, 0);
    }

    public Pet(String initialName, int initialAge, double initialWeight) {
        setName(initialName);
        setAge(initialAge);
        setWeight(initialWeight);
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = newAge;
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = newWeight; //name and age are unchanged.
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + " years" + "\nWeight: " + getWeight() + " pounds";
    }

    @Override
    public int compareTo(Pet pet) {
        return this.getAge() - pet.getAge();
    }
}

class NameCompare implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.getName().compareTo(pet2.getName());
    }
}

// Driver Class
class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = null;
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1- To read all Pet records from the file, and display them");
            System.out.println("2- To write all Pet records to the file");
            System.out.println("3- To write all Pet records sorted by age to the file");
            System.out.println("4- To write all Pet records sorted by name to the file");
            System.out.println("5- To Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("1- To read from binary file");
                System.out.println("2- To read from text file");

                System.out.print("Enter your choice: ");
                int fileChoice = input.nextInt();

                if (fileChoice == 1) {
                    pets = readBinaryFile();
                } else if (fileChoice == 2) {
                    pets = readTextFile();
                }

                System.out.println();
                System.out.println("All Pets Listed Below:");
                System.out.println();

                for (int i = 0; i < pets.size(); i++) {
                    System.out.println(pets.get(i).toString());
                    System.out.println();
                }
                System.out.println();

            } else if (choice == 2) {
                System.out.println("1- To write on binary file");
                System.out.println("2- To write on text file");

                System.out.print("Enter your choice: ");
                int fileChoice = input.nextInt();

                if (fileChoice == 1) {
                    writeBinaryFile(pets);
                } else if (fileChoice == 2) {
                    writeTextFile(pets);
                }
            } else if (choice == 3) {
                Collections.sort(pets);
                writeTextFile(pets);
            } else if (choice == 4) {
                Collections.sort(pets, new NameCompare());
                writeTextFile(pets);
            }
        } while (choice != 5);
    }

    // ---Read from Binary File---
    private static ArrayList<Pet> readBinaryFile() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Input File Name with Extension: ");
        String inFilename = input.nextLine();

        ObjectInputStream fileInput = null;
        ArrayList<Pet> pets = new ArrayList<Pet>();
        try {
            fileInput = new ObjectInputStream(new FileInputStream(inFilename));
        } catch (IOException e) {
            System.out.println("File not Found...!");
            e.printStackTrace();
        }

        try {
            while (true) {
                pets.add((Pet) fileInput.readObject());
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Binary File Read Successfully!");
        return pets;
    }

    // ---Write to the Binary File---
    private static void writeBinaryFile(ArrayList<Pet> pets) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Output File Name with Extension: ");
        String outFilename = input.nextLine();

        ObjectOutputStream fileOutput = null;
        try {
            fileOutput = new ObjectOutputStream(new FileOutputStream(outFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < pets.size(); i++) {
            try {
                fileOutput.writeObject(pets.get(i));
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

    // ---Read from Text File---
    private static ArrayList<Pet> readTextFile() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Input File Name with Extension: ");
        String inFilename = input.nextLine();

        Scanner fileInput = null;
        ArrayList<Pet> pets = new ArrayList<>();
        try {
            fileInput = new Scanner(new File(inFilename));
        } catch (FileNotFoundException e) {
            System.out.println("File not Found...!");
            e.printStackTrace();
        }
        while (fileInput.hasNext()) {
            pets.add(new Pet(fileInput.nextLine(), fileInput.nextInt(), fileInput.nextDouble()));
            fileInput.nextLine();
        }
        System.out.println("Text File Read Successfully!");
        fileInput.close();
        return pets;
    }

    // ---Write to the Text File---
    private static void writeTextFile(ArrayList<Pet> pets) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Output File Name with Extension: ");
        String outFilename = input.nextLine();

        PrintWriter fileOutput = null;
        try {
            fileOutput = new PrintWriter(outFilename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < pets.size(); i++) {
            fileOutput.println(pets.get(i).getName());
            fileOutput.println(pets.get(i).getAge());
            fileOutput.println(pets.get(i).getWeight());
            fileOutput.println();
        }
        System.out.println("Text File Written Successfully!");
        fileOutput.close();
    }
}