public class RemovingDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,5};
        int indexForNextNum = 1;
        for(int i =1;i<arr.length;i++){
            if (arr[i-1]<arr[i]) {
                arr[indexForNextNum]=arr[i];
                indexForNextNum++;
                
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        
        }
       
    }
    
}
