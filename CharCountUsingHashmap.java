import java.util.HashMap;
public class CharCountUsingHashmap {
    public static void main(String[] args) {
        String str = "aabbccddee";
        HashMap<Character, Integer> CharCount = new HashMap<>();
        for (Character c : str.toCharArray()){
            CharCount.put(c, CharCount.getOrDefault(c, 0) + 1);
            


        }
        for (Character c : CharCount.keySet()){
            System.out.println(c + " : " + CharCount.get(c));
        }
         
    }
    
}
