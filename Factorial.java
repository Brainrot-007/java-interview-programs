import java.util.*;
public class Factorial {
    
    static int factorail(int num){
        int res=1,i;
    for(i=1;i<num;i++){
        res*=i;

        } 
     return res; 
     }
public static void main(String[] args) {
    int num ;
    Scanner x = new Scanner(System.in);

    System.out.println("Enter the number");
    num = x.nextInt();

    System.out.println("Factorial of the num: " + num + " is "+ factorail(num));
}
}
