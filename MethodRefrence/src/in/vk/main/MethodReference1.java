package in.vk.main;

interface interf {
    void m1();
}

public class MethodReference1 {

    public void m2() {
        System.out.println("Method Reference");
    }

    public static void main(String[] args) {
        MethodReference1 obj = new MethodReference1();

        // Instance method reference
        interf i = obj::m2;

        // Invoke
        i.m1();
    }
}
