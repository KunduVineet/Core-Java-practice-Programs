package in.vk.main;

import java.util.ArrayList;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(5);
        l.add(15);
        
        // Optional: Print the list to verify
        System.out.println("Before sorting "+l);
        Collections.sort(l);
        System.out.println("After sorting "+ l);
    }
}