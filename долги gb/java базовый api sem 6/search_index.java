
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

        System.out.println(gettkey(num:1));
        System.out.println(gettkey(num:20));
    }

    private static int gettkey(int num) {
        return (Integer)hashMap.keySet().toArray()[num];
    }

    private static String getString(){
        return hashMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hashMap.put(numbers, PRESENT);
    }            
}  

        