import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int num, count=0;

        Scanner x = new Scanner(System.in);

        System.out.print("Enter the Prime Number: ");
        num = x.nextInt();

        if (num < 2) {
            System.out.println("The Number is "+ num + "is not prime Number");

            
        }
        else{
        for( int i=1;i<=num;i++){
            if (num%i==0) {
                count+=1;
                
            }
        }
        if(count>2)
        {
            System.out.println("The given numer "+num+" is not prime number");

        }
        else{
            System.out.println("The given number "+num+" is a Prime number");
        }
    }
    }
}
