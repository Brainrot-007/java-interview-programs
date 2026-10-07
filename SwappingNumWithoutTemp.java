import java.util.Scanner;

public class SwappingNumWithoutTemp {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the values of a : and B :");
        a = x.nextInt();
        b = x.nextInt();
        System.out.println("Befor Swapping a :"+a+" and b:"+b); 
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping a :"+a+" and b :"+b);
    }
    
}
