import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneNumber {
    private int areaCode;
    private int exchangeCode;
    private int number;

    public TelephoneNumber(String aString) throws Exception {
        this(0, 0, 0);
        String[] str = aString.split("-");
        if (str.length >= 2 && str.length <= 3) {
            if (str.length == 2) {
                twoDigitNumber(str);
            } else if (str.length == 3) {
                threeDigitNumber(str);
            }
        } else
            throw new Exception("Invalid Number Format...!");
    }

    public TelephoneNumber(int areaCode, int exchangeCode, int number) {
        this.areaCode = areaCode;
        this.exchangeCode = exchangeCode;
        this.number = number;
    }

    private void twoDigitNumber(String[] aString) {
        setExchangeCode(Integer.parseInt(aString[0]));
        setNumber(Integer.parseInt(aString[1]));
    }

    private void threeDigitNumber(String[] aString) {
        setAreaCode(Integer.parseInt(aString[0]));
        setExchangeCode(Integer.parseInt(aString[1]));
        setNumber(Integer.parseInt(aString[2]));
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(int exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (areaCode == 0)
            return getExchangeCode() + "-" + getNumber();
        else
            return getAreaCode() + "-" + getExchangeCode() + "-" + getNumber();
    }

    public static void main(String[] args) {
        PrintWriter output = null;
        FileReader fileInput = null;
        Scanner input = null;
        try {
            output = new PrintWriter("output.txt");
            fileInput = new FileReader("input.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File does not exist...!\nfilename = " + fileNotFoundException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println();
        }
        input = new Scanner(fileInput);

        ArrayList<TelephoneNumber> telephoneNumbers = new ArrayList<>(10);
        while (input.hasNext()) {
            try {
                telephoneNumbers.add(new TelephoneNumber(input.nextLine()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < telephoneNumbers.size(); i++) {
            System.out.println(telephoneNumbers.get(i));
            output.println(telephoneNumbers.get(i));
        }

        //Deleting Entries
        telephoneNumbers.remove(0);
        telephoneNumbers.remove(1);

        //Adding Numbers
        try {
            telephoneNumbers.add(new TelephoneNumber("154-859-8899"));
            telephoneNumbers.add(new TelephoneNumber("899-5885"));
            telephoneNumbers.add(new TelephoneNumber("152-849-9636"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Displaying Numbers After Deleting and Adding...");

        for (int i = 0; i < telephoneNumbers.size(); i++) {
            System.out.println(telephoneNumbers.get(i));
            output.println(telephoneNumbers.get(i));
        }
    }
}
