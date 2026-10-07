
import java.util.Scanner;
public class SwappingNumber {
    public static void main(String args[])
    {
        int a, b;

        Scanner  x= new Scanner(System.in);

        System.out.print("Enter the value of a: ");

        a = x.nextInt();
        System.out.print("Enter the valulue of b: ");

        b = x.nextInt();
         
        System.out.println("befor swapping a: "+a +" and b :"+b);
        int temp=a;
        a = b;
        b = temp;
        System.out.println("After Swappping a: "+a +" and b: "+b);


    }
    
}
