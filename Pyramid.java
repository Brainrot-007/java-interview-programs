import java.util.Scanner;
public class Pyramid {
    public static void main(String args[]){
        int num ;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        num = x.nextInt();

        for(int i= 0;i<num;i++){
            
            for(int s=0;s<num-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    x.close();}
    
}
