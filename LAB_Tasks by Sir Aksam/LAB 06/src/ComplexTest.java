import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Complex[] A = new Complex[3];
        Complex[] B = new Complex[3];

        A[0] = new Complex(5, 7);
        A[1] = new Complex(3, 9);
        A[2] = new Complex(2, -4);

        B[0] = new Complex(1, 6);
        B[1] = new Complex(7, -8);
        B[2] = new Complex(5, 5);


        for (int i = 0; i < A.length; i++) {
            Complex resultant = Complex.addition(A[i],B[i]);
            System.out.println("resultant = " + resultant);
            System.out.println("Modulus of resultant = " + resultant.modulus());
            System.out.println();
        }
    }
}
