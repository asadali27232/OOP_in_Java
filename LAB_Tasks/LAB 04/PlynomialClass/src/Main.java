
public class Main {
    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial(3, 2, 3, 4, 5);
        Polynomial polynomial2 = new Polynomial(3, 6, 1, 5);
        
        System.out.println(polynomial1);
        System.out.println(polynomial2);
        
        System.out.println();
        System.out.println("Answer of Polynomial " + polynomial1 + " for x = 2 is: " + polynomial1.evaluatePolynomial(2));
        System.out.println("Answer of Polynomial " + polynomial2 + " for x = 2 is: " + polynomial2.evaluatePolynomial(2));
        
        System.out.println();
        System.out.println("Sum of Polynomial is: ");
        System.out.print("Sum of " + polynomial1 + "   +   "  + polynomial2 + " is: ");
        polynomial1.addPolynomial(polynomial2);
        System.out.println(polynomial1);
        
        System.out.print("Sum of " + polynomial1 + "   +   " + polynomial2 + " is: ");
        Polynomial resultPolinomal = Polynomial.addPolynomial(polynomial1, polynomial2);
        System.out.println(resultPolinomal);
        
        System.out.println();
        System.out.println("Product of Polynomial is: ");
        
    }
}