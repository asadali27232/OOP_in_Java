//dev: SP21-BCS-007
public class QuadraticRoots {
    private int a;
    private int b;
    protected int c;
    private double root1;
    private double root2;
    
    public QuadraticRoots(int a, int b, int c, double root1, double root2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.root1 = root1;
        this.root2 = root2;
    }
    
    public QuadraticRoots() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.root1 = 0.0;
        this.root2 = 0.0;
    }
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public int getC() {
        return c;
    }
    
    public void setC(int c) {
        this.c = c;
    }
    
    public double getRoot1() {
        return root1;
    }
    
    public void setRoot1(double root1) {
        this.root1 = root1;
    }
    
    public double getRoot2() {
        return root2;
    }
    
    public void setRoot2(double root2) {
        this.root2 = root2;
    }
    private void rootsInvalid(){
        System.out.println("Roots for " + a + ", " + b + " and " +
                c + " are not real (i.e imaginary roots");
    }
    private void rootsValid(double rootX, double rootY){
        System.out.println();
    }
    public void computeRoots(){
        double sqrt = (b*b)-(4*a*c);
        if (sqrt<0)
            rootsInvalid();
        else{
            double rootX = -b+(sqrt);
        }
        
    }
}
