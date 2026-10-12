import java.util.Arrays;

public class CheckTwoStringsAreAnagram {
    public static boolean isAnagram(String str , String str1){
    String sr = str.replaceAll("\\s", "");
    String sr1 = str1.replaceAll("\\s", "");

    if(sr.length() != sr1.length()){
        return false;
    }
    else{
        char ch1[] = sr.toLowerCase().toCharArray();
        char ch2[] = sr1.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }


    }
    public static void main(String args[]){
      System.out.println(isAnagram("listen","silent"));
    }
    
}
