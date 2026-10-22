import java.util.HashMap;

public class HashMapExample {
   

    public static void main(String[] args) {
         HashMap<String, Integer> empid = new HashMap<>();
        empid.put("Alice", 101);
        empid.put("Bob", 102);
        empid.put("jerry", 103);

        System.out.println(empid);

        // get the value of key "Alice" 

        System.out.println(empid.get("Alice")); 

        // check if the key "john" exists in the HashMap

        System.out.println(empid.containsKey("john"));
         
        // check if the value 102 exists in the HashMap

        System.out.println(empid.containsValue(102));

        // change the value of key "john" to 106 and if the key "john" does not exist, add it to the HashMap

        empid.put("john", 106);
        System.out.println(empid);

        // replace the value of key "john" with 105 and if the key "john" does not exist, do nothing

        empid.replace("john", 105);

        // add a new key-value pair to the HashMap only if the key "steve" does not already exist

        empid.putIfAbsent("steve", 107);
        System.out.println(empid);

        // remove the key-value pair with key "steve" from the HashMap

        empid.remove("steve");
        System.out.println(empid);

    
    }
}
