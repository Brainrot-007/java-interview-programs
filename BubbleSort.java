public class BubbleSort {
 public static void main(String[] args) {
    int arr[] = {5,1,4,2,8};
    int length = arr.length;
    int temp =0;

    for(int i=0;i<length;i++){
        for(int j=1;j<length-i;j++){
            if (arr[j-1]>arr[j]) {
                 temp = arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j]=temp;



                
            }
        }
    }
    System.out.println("The sorted array");
    for(int i=0;i<length;i++){
        System.out.println(arr[i]);
    }
 }   
}
