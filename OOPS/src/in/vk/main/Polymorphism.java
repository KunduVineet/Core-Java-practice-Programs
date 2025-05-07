package in.vk.main;

public class Polymorphism {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Method to be overridden
    public void describe() {
        System.out.println("This is a basic calculator.");
    }
}

// Child class
class AdvancedCalculator extends Polymorphism {
    @Override
    public void describe() {
        System.out.println("This is an advanced calculator with enhanced features.");
    }

    public static void main(String[] args) {
        // Demonstrate method overloading
        Polymorphism calc = new Polymorphism();
        System.out.println("Sum of 2 ints: " + calc.add(2, 3));          // Calls add(int, int)
        System.out.println("Sum of 3 ints: " + calc.add(2, 3, 4));       // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));   // Calls add(double, double)

        // Demonstrate method overriding
        Polymorphism basicCalc = new Polymorphism();
        Polymorphism advCalc = new AdvancedCalculator(); // Parent reference, child object
        basicCalc.describe(); // Calls Calculator's describe
        advCalc.describe();   // Calls AdvancedCalculator's describe (runtime polymorphism)
    }
}