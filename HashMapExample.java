import java.util.HashMap;

public class HashMapExample {
    HashMap<String, Integer> empid = new HashMap<>();

    public static void main(String[] args) {
        HashMapExample example = new HashMapExample();
        example.empid.put("Alice", 101);
        example.empid.put("Bob", 102);

        System.out.println(example.empid);
    }
}
