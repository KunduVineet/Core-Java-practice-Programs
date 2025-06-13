package in.vk.main;

public class Singleton {
	 // Static variable to hold the single instance
    private static Singleton instance = null;
    
    // Private constructor - prevents external instantiation
    private Singleton() {
        // initialization code
    }
    
    // Public static method to get the instance
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
 // Usage:
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

}
