package com.company;

import java.util.Scanner;

public class DataTypessPractice {

    public static void main(String[] args) {
        byte x = 127; //-128
        short y = 32767; //-32768
        int z = 2147483647; //-2147483648
        long a = 854775807; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float b = (float) 155.2222;
        double c = 15.255555555555555;
        boolean d = true;
        char e = 'A';
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter byte: ");
        x = input.nextByte();
        
        System.out.print("Enter short: ");
        y = input.nextShort();

        System.out.print("Enter int: ");
        z = input.nextInt();

        System.out.print("Enter long: ");
        a = input.nextLong();

        System.out.print("Enter float: ");
        b = input.nextFloat();

        System.out.print("Enter double: ");
        c = input.nextDouble();

        System.out.print("Enter boolean: ");
        d = input.nextBoolean();

        System.out.print("Enter character: ");
        e =  input.next().charAt(0);
        
        System.out.println();
        System.out.println();
        System.out.println("byte: " + x);
        System.out.println("short: "+ y);
        System.out.println("int: " + z);
        System.out.println("long: " + a);
        System.out.println("float: " + b);
        System.out.println("double: " + c);
        System.out.println("boolean: " + d);
        System.out.println("character: " + e);
    }
}
