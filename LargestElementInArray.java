import java.util.*;
public class LargestElementInArray {

    public static void main(String[] args) {
        Scanner  X = new Scanner(System.in);
        int num;
        System.out.print("Enter the num of Elements in a array:");
        num = X.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array values");
        for(int i=0;i<num;i++){
            arr[i] = X.nextInt();
        }
        int largest = arr[0];
      
        for(int j=1;j<num;j++){
           if(arr[j]>largest){ 

           
          
            largest = arr[j];}

        

        }
        System.out.println("Largest in this array is :"+largest);
        




    }
    
}
