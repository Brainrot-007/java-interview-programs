import java.util.*;
public class SecondLargestInArray {

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
        int SecondLargest = 0;
        for(int j=1;j<num;j++){
           if(arr[j]>largest){ 
            SecondLargest = largest;
            largest = arr[j];}
            else if(arr[j]<largest && arr[j]>SecondLargest){
                SecondLargest = arr[j];
            }

        

        }
        System.out.println("SecondLargest in this array is :"+SecondLargest);
        




    }
    
}
