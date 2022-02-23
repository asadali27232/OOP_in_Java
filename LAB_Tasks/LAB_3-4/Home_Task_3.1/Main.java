// dev: SP21-BCS-007
public class Main {
    public static void main(String[] args){
        QuadraticRoots root = new QuadraticRoots();
        
        root.setA(2);
        root.setB(10);
        root.setC(5);
        
        root.computeRoots();
    }
}
