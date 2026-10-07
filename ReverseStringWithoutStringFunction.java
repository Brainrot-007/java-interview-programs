import java.util.Scanner;
public class ReverseStringWithoutStringFunction {
    public static void main(String[] args) {
        
 
    Scanner x = new Scanner(System.in);
    System.out.print("Enter the String to reverse:");
    String a =x.next();
    String revers ="";

    char ch;
    for(int i=0;i<a.length();i++){
        ch=a.charAt(i);
        revers =ch+ revers;
    }
    System.out.println("The reveresed String is:"+revers);
    
   }
}
