/*import java.util.*;
public class AmstrongNumber {
    public static int getAmstrongNumber(int num,int order){
        if(num==0){
            return 0;
        }   
        int digit = num%10;
        return (int) Math.pow(digit, order)+getAmstrongNumber(num/10,order);
    }
    public static int getlength(int num){
       int len=0;
       while (num!=0) {
        num=num/10;
        len++;
        
        
       }
       return len;
    }
    public static void main(String[] args) {
        int num ;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number");
        num = x.nextInt();
        if(num == getAmstrongNumber(num, getlength(num)))
        {System.out.println("The number is amstrong number");}
        else
        {
            System.out.println("The number is not amstrong number");
        }
        
    }
    
}
*/
import java.util.*;
public class AmstrongNumber {

    public static int getAmstrogNumber(int num,int len){
        if (num==0){
            return 0;

        }
       int digit = num%10;
       return (int) Math.pow(digit, len)+ getAmstrogNumber(num/10, len);
    }
    public static int getOrder(int num){
        int len=0;
        while (num!=0) {
            num =num/10;
            len+=1;
            
        }
        return len;
    }
    public static void main(String[] args) {
        int num;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of the number");
        num = x.nextInt();

        int len= getOrder(num);
        if(num==getAmstrogNumber(num, len)){
            System.out.println("The number is amstrong number");

        }
        else{
            System.out.println("the number is not amstrong number");
        }
    }
}