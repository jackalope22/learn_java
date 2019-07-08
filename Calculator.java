public class Calculator{

    public Calculator() {
        
    }

    public int add(int a, int b) {
        int totalAdded = a + b;
        return totalAdded;
    }

    public int subtract(int a, int b) {
        int totalSubtracted = a - b;
        return totalSubtracted;
    }

    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        System.out.println(mycalculator.add(2,2));
        System.out.println(mycalculator.subtract(3,4));
    }
    
}