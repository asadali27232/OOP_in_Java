public class Polynomial {
    private int degree;
    private double[] coefficients;
    
    public Polynomial(int degree) {
        setDegree(degree);
        this.coefficients = new double[degree];
        for (int i = 0; i < degree ; i++) {
            this.coefficients[i] = 0;
        }
    }
    
    public Polynomial(int degree, double...coefficients) {
        setDegree(degree);
        if (coefficients.length == degree) {
            this.coefficients = new double[degree];
            System.arraycopy(coefficients, 0, this.coefficients, 0, getDegree());
        }
        else {
            System.out.println("Your given list of coefficients is not matching the degree of polynomial. So all coefficients are set to /'0/'");
            this.coefficients = new double[degree];
            for (int i = 0; i < getDegree() ; i++) {
                this.coefficients[i] = 0;
            }
        }
    }
    
    public int getDegree() {
        return degree;
    }
    
    public void setDegree(int degree) {
        this.degree = degree;
    }
    
    public double[] getCoefficients() {
        return coefficients;
    }
    
    public void setCoefficients(int i, double coefficients) {
        this.coefficients[i] = coefficients;
    }
    
    public String toString() {
        String string = "P(x) = ";
        for (int i = 0; i < this.coefficients.length ; i++) {
            String string1 = coefficients[i] + "x^" + i;
            string = string.concat(string1);
            if (i < this.coefficients.length - 1) {
                String string2 = " + ";
                string = string.concat(string2);
            }
        }
        return string;
    }
    
    public double evaluatePolynomial(int x){
        double result = 0.0;
        for (int i = 0; i < getDegree(); i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }
    
    public void addPolynomial(Polynomial polynomialToBeAdded){
        if (polynomialToBeAdded.coefficients.length == this.coefficients.length) {
            for (int i = 0; i < getDegree(); i++) {
                this.coefficients[i] += polynomialToBeAdded.coefficients[i];
            }
        }
        else {
            System.out.println("The polynomial that you are trying to add are not of same degree");
        }
    }
    
    public static Polynomial addPolynomial(Polynomial polyn1, Polynomial polyn2) {
        Polynomial resultPolyn = new Polynomial(polyn1.coefficients.length);
        if (polyn1.coefficients.length == polyn2.coefficients.length) {
            for (int i = 0; i < resultPolyn.coefficients.length; i++) {
                resultPolyn.coefficients[i] = polyn1.coefficients[i] + polyn2.coefficients[i];
            }
        }
        else {
            System.out.println("The polynomial that you are trying to add are not of same degree");
        }
        return resultPolyn;
    }
    
    public void MultiplyPolynomial(Polynomial polynomialToBeAdded){
        if (polynomialToBeAdded.coefficients.length == this.coefficients.length) {
            for (int i = 0; i < getDegree(); i++) {
                this.coefficients[i] *= polynomialToBeAdded.coefficients[i];
            }
        }
        else {
            System.out.println("The polynomial that you are trying to Multiply are not of same degree");
        }
    }
    
    public static Polynomial MultiplyPolynomial(Polynomial polyn1, Polynomial polyn2) {
        Polynomial resultPolyn = new Polynomial(polyn1.coefficients.length);
        if (polyn1.coefficients.length == polyn2.coefficients.length) {
            for (int i = 0; i < resultPolyn.coefficients.length; i++) {
                resultPolyn.coefficients[i] = polyn1.coefficients[i] * polyn2.coefficients[i];
            }
        }
        else {
            System.out.println("The polynomial that you are trying to Multiply are not of same degree");
        }
        return resultPolyn;
    }
}
