// Remove or adjust the package declaration based on your project structure
// package in.vk.main;
package in.vk.main;

import java.util.ArrayList;

public class ArrayListP1 { // Changed class name to avoid conflict
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(); // Use java.util.ArrayList
        l.add("Sunny");
        l.add("Bunny");
        l.add("Sunny");
        System.out.println(l); // Optional: Print the list to verify
    }
}