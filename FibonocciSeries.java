import java.util.Scanner;
class FibonocciSeries{
    public static void main(String args[]){
        int num;
        int a = 0,b = 1;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter the number");
        num = x.nextInt();

        System.out.print(a + " , "+ b + " , ");
        
        int NextTerm;
        for(int i=2; i<num;i++){
            NextTerm = a + b;
            a = b;
            b = NextTerm;
            
            System.out.print( NextTerm + " , ");
        }

    }
}