package in.vk.main;

@FunctionalInterface
public interface Functional2 {
    void m1();
}

@FunctionalInterface
interface C extends Functional2 {
    // Inherits m1() from Functional2
}

// A class implementing the interface
class Test implements C {
    @Override
    public void m1() {
        System.out.println("Implementing m1");
    }
}