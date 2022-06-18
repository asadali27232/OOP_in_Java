public class Main {
    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial(4, 2, 3, 4, 3);
        Polynomial polynomial2 = new Polynomial(3, 6, 1, 5);

        System.out.println();
        System.out.println();
        System.out.println(polynomial1);
        System.out.println(polynomial2);

        System.out.println();
        System.out.println();
        System.out.println("Answer of Polynomial " + polynomial1 + " for x = 2 is: " + polynomial1.evaluatePolynomial(2));
        System.out.println("Answer of Polynomial " + polynomial2 + " for x = 2 is: " + polynomial2.evaluatePolynomial(2));

        System.out.println();
        System.out.println();

        System.out.println("Sum of Polynomial by Method Call on an Object (Different Degree): ");
        System.out.print("Sum of " + polynomial1 + "\n" +
                         "     + " + polynomial2 + "\n");
        polynomial1.addPolynomial(polynomial2);
        System.out.println("  is = " + polynomial1);

        System.out.println();

        System.out.println("Sum of Polynomial by Static Method Call using Class Name (Same Degree): ");
        System.out.print("Sum of " + polynomial1 + "\n" +
                         "     + " + polynomial2 + "\n");
        Polynomial resultPolinomal = Polynomial.addPolynomial(polynomial1, polynomial2);
        System.out.println("  is = " + resultPolinomal);

        System.out.println();
    }
}