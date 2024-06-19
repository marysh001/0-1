
// import java.security.Key;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Set;

public class Program {
    private static HashMap <Integer, Object> hashMap = new HashMap<>();
    private static final Object PRESENT  = new Object();
    public static void main(String[] args) throws Exception {
        add(numbers:11);
        add(numbers:22);
        add(numbers:33);
        add(numbers:44);
        add(numbers:55);
        // System.out.println(hashMap.keySet());
        System.out.println(getString());
    }

    private static String getString() {
        return hashMap.keySet().toString();
    }

    private static String getString(){
        return hashMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hashMap.put(numbers, PRESENT);
    }            
}  

        