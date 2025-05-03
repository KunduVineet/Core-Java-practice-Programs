package in.vk.main;

public class Polymorphism {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(int a, int b, double c) {
        return a + b + c;
    }
}

class Implement extends Polymorphism {
    
    public static void main(String[] args) {
        Polymorphism p = new Polymorphism(); // object of Polymorphism class
        int a = p.add(1, 2);
        double c = p.add(3, 5, 7); // corrected to double
        
        System.out.println(a);
        System.out.println(c);
    }
}
