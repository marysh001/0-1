// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. 
// Формат данных Integer.

// import java.security.Key;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Set;

public class Program {
    private static HashMap <Integer, Object> hashMap = new HashMap<>();
    private static final Object PRESENT  = new Object();
    public static void main(String[] args) throws Exception {
        add(11);
        add(22);
        add(33);
        add(44);
        add(55);
        // System.out.println(hashMap.keySet());
        System.out.println(getString());

        System.out.println(gettkey(1));
        System.out.println(gettkey(20));
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

        