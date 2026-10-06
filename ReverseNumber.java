import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        
        int num;
        
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        num = x.nextInt();

        int reverse=0;
        int rem;
        while (num!=0) {
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;

        }
        System.out.println("The reverse of the number is "+reverse);
    }
    
}
